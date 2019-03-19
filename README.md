# Installation

```bash
./run.sh
```

# Configuration in ConCodeSe

* Browser open the URL: http://localhost:8081/ConCodeSe/

* Enter issue id "SWT-1"

* Enter project name "SWT v3.1"

* Edit project summary, e.g., "Make default size of empty composites smaller"

* Edit project description, e.g., 

```
Could the following two constants in Widget.java be changed to something smaller?

```

* Click "Click here to search for relevant code files"

# Configuration in JIRA

* Browser open the URL (in another tab): http://localhost:8080

* Add Issue Type "Bug" through "Settings > System > Webhooks" 

* Add the following URL to "Settings > System > Webhooks" 

```
http://localhost:8081/ConCodeSe/searchAndRank/${project.id}/${project.key}/${issue.id}/${issue.key}
```

* Add the following Event to "Settings > System > Webhooks" 
```
issuetype = Bug AND project = SWT
```

* Tick to check "created" and "updated" events 

* Create a new project "SWT"

* Create a new issue "Bug"

* A comment from "ConCodeSe" will be added whenever an issue is "Created" or "Updated"


# More debug information

JIRA Logs
```
/var/atlassian/jira/log/atlassian-jira.log
```

ConCodeSe Logs:
```
/concodese/log/console_output.log
```
