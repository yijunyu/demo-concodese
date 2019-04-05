`# Installation

```bash
./run.sh
```

# Using ConCodeSe

* Browser open the URL: http://localhost:8081/ConCodeSe/

* Enter issue id "SWT-1"

* Enter project name "SWT v3.1"

* Edit bug summary, e.g., "Make default size of empty composites smaller"

* Edit bug description, e.g., 

```
Could the following two constants in Widget.java be changed to something smaller?

```

* Click "Click here to search for relevant code files"

# Using JIRA

* Browser open the URL (in another tab): http://localhost:8080

* Log in as user "yijunyu" using the password `SearchAndRank10`

* Create a new project, e.g., "SWT"

* Create a new issue of "Bug" type

* Enter bug summary, e.g., "Make default size of empty composites smaller"

* Enter bug description, e.g., 
```
Could the following two constants in Widget.java be changed to something smaller?
```

* A comment from "ConCodeSe" will be added whenever an issue is "Created" or "Updated"

## Configuration in JIRA

* Add Issue Type "Bug" through "Settings > System > Webhooks" 

* Add the following URL to "Settings > System > Webhooks" 

```
http://concodese:8081/ConCodeSe/searchAndRank/${project.id}/${project.key}/${issue.id}/${issue.key}
```

* Add the following Event to "Settings > System > Webhooks" 
```
issuetype = Bug AND project = SWT
```

* Tick to check "created" and "updated" events 


## More debug information

JIRA Logs
```
/var/atlassian/jira/log/atlassian-jira.log
```

ConCodeSe Logs:
```
/concodese/log/console_output.log
```

## Interfacing concodese with fast
```bash
id=$(docker ps --filter "publish=8081"  --format "{{.ID}}") 
docker exec -it $id /bin/bash
```
Inside the demo-cocodese, run 
```bash
echo "void main() { }" > t.java
fast -ip t.java t.pb
```
The identifiers with their position will be shown as
```
 t main(1,6)
```
where the first column is the filename, the identifiers are associated with a pair of line and column numbers.

## Example C/C++ programs
https://github.com/electricalwind/data7
```
go.sh d1_both.c
```

## Example C# programs

Firefox
