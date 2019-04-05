id=$(docker ps --filter "publish=8081"  --format "{{.ID}}")
file=${1:-Example.java}
docker cp bin/$file $id:/concodese/bin/
docker exec -it $id /bin/bash -c "java -cp /usr/lib:/usr/lib/intt.jar Example $file"
