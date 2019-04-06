BEGIN {
	prev_cast = ""
	cast = ""
	cast_script = ""
	is_checked = 0
	e = system("[ ! -f reset.sh ]")
	if (e) {
		system("reset.sh")
	}
}
function asciinema_cast(prev_cast, cast, cast_script) {
	e = system("[ ! -f " cast ".cast ]")
	if (!e) {
		print cast_script > cast ".cast"
		print "exit" > cast ".cast"
		if (prev_cast != "") {
			cmd = "rm -f " cast ".cast.json && cp " prev_cast ".cast " cast ".cast.json"
			print cmd
			system(cmd)
			cmd = "cat " cast ".cast | asciinema rec --append " cast ".cast.json"
		} else {
			cmd = "rm -f " cast ".cast.json && cat " cast ".cast | asciinema rec " cast ".cast.json"
		}
		print cmd
		system(cmd)
		system("cat " cast ".cast.json | sed -e '2,3d' | sed -e :a -e '1,3!{P;N;D;};N;ba' > " cast ".cast")
	}
	#n = split(cast_script, b, /\n/)
	#for (i = 1; i <= n; i++) {
	#	if (match(b[i],/^#/)) {
	#		print(b[i]) > cast ".cast"
	#	}
	#}
}

/- \[.\] / {
	split($0, a, /\] /)
	if (cast_script != "" && cast != "" && is_checked) {
		asciinema_cast(prev_cast, cast, cast_script)
	}	
	if (match(a[1], /- \[x/)) {
		is_checked = 1
	} else {
		is_checked = 0
	}
	cast_script = ""
	prev_cast = cast
	cast = a[2]
}
! /- \[.\] / {
	cast_script = cast_script $0 "\n"
}
END {
	if (cast_script != "" && cast != "" && is_checked) {
		asciinema_cast(prev_cast, cast, cast_script)
		cast_script = ""
	}	
}
