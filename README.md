# go-restapi-service
go restapi service
## start.spring.io
[share link](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.3.10.RELEASE&packaging=jar&jvmVersion=1.8&groupId=go.restapi.service&artifactId=go-restapi-service&name=go-restapi-service&description=demo%20spring%20boot%20for%20rest%20api%20service&packageName=go.restapi.service.go-restapi-service&dependencies=web,devtools,lombok,actuator)
## apis
### post
http://localhost:8080/users/
#### body
```json
{
"firstName": "fname",
"lastName": "lname",
"email": "emailaddr@ooo.com",
"password": "1234"
}
```
### get
http://localhost:8080/users/<uuid>
### update
http://localhost:8080/users/<uuid>
#### body
```json
{
"firstName": "fname2",
"lastName": "lname2"
}
```
### delete
todo
## swagger
todo