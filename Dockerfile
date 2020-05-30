FROM maven:3.5-jdk-8
## Mount or copy (see docker-compose.yaml)
COPY . /app
WORKDIR /app
#RUN mvn clean spring-boot:run