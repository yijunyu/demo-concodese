#from laslabs/alpine-jira
#from cptactionhank/atlassian-jira:latest
from cptactionhank/atlassian-jira-software:latest
USER root
RUN mkdir -p /concodese 
COPY bin /concodese/bin
COPY config /concodese/config
COPY projects /concodese/projects
COPY log /concodese/log
COPY sample /concodese/sample
COPY doc /concodese/doc
