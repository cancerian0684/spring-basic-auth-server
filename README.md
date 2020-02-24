# spring-basic-auth-server
Sample Spring Boot Basic Auth Server

## Pre-requisites
1. Java 11
2. IDEA (IntelliJ IDEA or Eclipse)


## Build the project
To build the project, run the below command

    ./gradlew clean build


## Running the project
We can run the project using gradle task

    ./gradlew :bootRun
    
## Endpoints

Credentials
```text
username: admin
password: password
```

Http GET endpoints:

    GET /secured/hello
    Header: Basic Auth
    
Http POST endpoint:
    
    POST /secured/hello
    Header: Basic Auth    
    Body: {"name": "test"}
