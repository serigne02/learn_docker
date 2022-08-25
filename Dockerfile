FROM openjdk:8
ADD target/learn_docker-0.0.1.jar learn_docker-0.0.1.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "learn_docker-0.0.1.jar"]

#ADD ./target/test_seuveur-0.0.1-SNAPSHOT.jar app.jar
#ENV MYSQL_ROOT_USERNAME=root \
   # MYSQL_ROOT_PASSWORD=@zheng02 \
	#MYSQL_DATABASE=dockerdb
#RUN mkdir APP_HOME
#WORKDIR APP_HOME
#COPY . APP_HOME

