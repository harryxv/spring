## maven command to build and deploy war application to tomcat
mvn clean
mvn compile war:exploded
##mvn --version

##tomcat start and shutdown
startup.sh
shutdown.sh

## java runs class in jar
java -cp path_to_classes package_Class_name

## build war file instead jar file in pom.xml
 <packaging>war</packaging>
