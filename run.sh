docker build -t yijun/demo-concodese .
vid=$(docker volume inspect jiradb)
if [ "$?" = "1" ]; then
	docker volume create jiradb
fi
id=$(docker ps --filter "publish=8080"  --format "{{.ID}}")
if [ "$id" != "" ]; then
	docker kill $id
fi
id=$(docker ps --filter "publish=8081"  --format "{{.ID}}")
if [ "$id" != "" ]; then
	docker kill $id
fi
docker run --detach --mount source=jiradb,destination=/var/atlassian/jira -p 8080:8080 cptactionhank/atlassian-jira-software:latest
docker run --detach -p 8081:8081 yijun/demo-concodese
id=$(docker ps --filter "publish=8081"  --format "{{.ID}}")
docker exec -it $id /bin/bash
