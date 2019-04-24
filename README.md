# docker-sample-db
Docker compose for web(tomcat war) and mysql database

Instructions:
Install Docker:  https://docs.docker.com/install/ 

Install docker-compose: https://docs.docker.com/compose/install/ 

Run:
docker-compose up -d

Access application at IP:Port/tcmc in browser

Stop:
docker-compose stop db

docker-compose rm -fv db

docker-compose stop web

docker-compose rm -fv web

