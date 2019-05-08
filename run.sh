id=$(docker ps --filter "publish=8080"  --format "{{.ID}}")
if [ "$id" != "" ]; then
	docker kill $id
	docker rm jira
fi
id=$(docker ps --filter "publish=8081"  --format "{{.ID}}")
if [ "$id" != "" ]; then
	docker kill $id
	docker rm concodese
fi
docker network prune
docker network create mynet
docker run --rm --privileged=true --name jira --net mynet --detach -v $(pwd)/jiradb:/var/atlassian/jira -p 8080:8080 cptactionhank/atlassian-jira-software:latest
docker run -u $(id -u):$(id -g) --rm --name concodese --net mynet --detach -v /tmp:/tmp -v ${1:-$(pwd)}:/projects -w /projects -p 8081:8081 yijun/demo-concodese
id=$(docker ps --filter "publish=8081"  --format "{{.ID}}") 
docker exec -it $id /bin/bash
