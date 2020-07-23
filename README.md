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

Credentials for accessing the endpoint are:
```text
username: admin
password: password
```

Equivalent Basic auth header for these credentials is: 

    Authorization: Basic YWRtaW46cGFzc3dvcmQ=

Http GET endpoints:

    GET /secured/hello
    Authorization: Basic YWRtaW46cGFzc3dvcmQ=
    
Http POST endpoint:
    
    POST /secured/hello
    Authorization: Basic YWRtaW46cGFzc3dvcmQ=  
    Body: {"name": "test"}
