docker run --rm -v jiradb:/var/atlassian/jira busybox sh -c 'tar -cOzf - /var/atlassian/jira' > jira-export.tgz
