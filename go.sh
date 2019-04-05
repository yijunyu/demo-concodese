id=$(docker ps --filter "publish=8081"  --format "{{.ID}}")
file=${1:-Fast.java}
docker cp bin/$file $id:/concodese/bin/
docker exec -it $id /bin/bash -c "java -cp /usr/lib:/usr/lib/intt.jar:/usr/lib/fast-1.0-SNAPSHOT.jar:/usr/lib/flatbuffers-java-1.10.0.jar Fast $file"
