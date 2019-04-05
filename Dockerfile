from yijun/fast:latest
USER root
RUN mkdir -p /concodese 
COPY bin /concodese/bin
COPY config /concodese/config
COPY projects /concodese/projects
COPY log /concodese/log
COPY sample /concodese/sample
COPY doc /concodese/doc
COPY intt.jar /usr/lib/intt.jar
COPY flatbuffers-java-1.10.0.jar /usr/lib/flatbuffers-java-1.10.0.jar
COPY fast-1.0-SNAPSHOT.jar /usr/lib/fast-1.0-SNAPSHOT.jar
RUN cd /concodese/bin && ./UpdateProjectConfigData.sh
WORKDIR /concodese/bin
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "/usr/bin/java -cp /concodese/config/lic:/concodese/bin/ConCodeSe-1.0.0.jar com.concodese.ConCodeSeJettyServerStarter SERVER_PORT=8081  >> /concodese/log/console_concodese.log"]
RUN apk add -U nss
