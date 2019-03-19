#from laslabs/alpine-jira
from cptactionhank/atlassian-jira:latest
USER root
RUN mkdir -p /concodese 
COPY bin /concodese/bin
COPY config /concodese/config
