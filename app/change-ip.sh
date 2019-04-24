#!bin/bash

vi src/main/resources/hibernate.cfg.xml
rm src/main/java/hibernate.cfg.xml
cp src/main/resources/hibernate.cfg.xml src/main/java/

sudo mvn clean install

cp target/MCC.war ../web/
rm ../web/tcmc.war
mv ../web/MCC.war ../web/tcmc.war 

cd ..
sudo docker rm -f $(sudo docker ps -aq)
sudo docker-compose up
