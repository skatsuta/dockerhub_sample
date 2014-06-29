    $ wget https://github.com/Taichi-SHINDO/dockerhub_sample/archive/master.zip
    $ unzip -o master.zip
    $ cd dockerhub_sample-master/
    $ gradle build
    $ gradle war
    $ mv hello.war ${TOMCAT_DIR}/webapps/

http://localhost:8080/hello/index
