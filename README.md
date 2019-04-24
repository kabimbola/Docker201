# Docker201 Project
### DockerCompose for Web(Apache Tomcat war) and MySql Database

#### Project Structure Description 
At the root the project contains three important folders listed below: 

```
##### 1. app/
```
This folder contains the source-code files for a Spring MVC Web Application called Mindtree Kalinga Cricket Council (written in Java). Update the file *app/src/main/resources/hibernate.cfg.xml* for changing Hibernate connection properties. 

```
##### 2. db/
```
The db/ folder consists of *.sql files* that you may want to run on your database while creating the containers. This folder may used to place additional database and table definitions (if intended). 

```
##### 3. web/
```
This folder consists of a Dockerfile and the .war file to deploy on the Tomcat Server. You may add your own .war files here and modify the Dockerfile accordingly. 

