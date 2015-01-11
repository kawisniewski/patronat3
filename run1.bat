 mvn package -Dmaven.test.skip=true

java -jar target/dropwizard-example-0.8.0-rc2-SNAPSHOT.jar db migrate example.yml