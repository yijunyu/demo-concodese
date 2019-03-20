from yijun/fast:latest
USER root
RUN mkdir -p /concodese 
COPY bin /concodese/bin
COPY config /concodese/config
COPY projects /concodese/projects
COPY log /concodese/log
COPY sample /concodese/sample
COPY doc /concodese/doc
RUN cd /concodese/bin && ./UpdateProjectConfigData.sh
WORKDIR /concodese/bin
EXPOSE 8081
ENTRYPOINT [ "/usr/bin/java", "-cp", "/concodese/config/lic:/concodese/bin/ConCodeSe-1.0.0.jar", "com.concodese.ConCodeSeJettyServerStarter", "SERVER_PORT=8081"]
