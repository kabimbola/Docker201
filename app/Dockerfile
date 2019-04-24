FROM tomcat

MAINTAINER mayank

RUN apt-get update && apt-get -y upgrade

WORKDIR /usr/local/tomcat

COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY target/MCC.war /usr/local/tomcat/webapps/
COPY target/guns.war /usr/local/tomcat/webapps/

EXPOSE 8080
