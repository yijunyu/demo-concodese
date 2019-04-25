cd fast && mvn install && mv target/fast-1.0-SNAPSHOT.jar ../docker && cd ..
docker build -t yijun/demo-concodese docker
docker push yijun/demo-concodese
