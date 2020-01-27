# CarAppAngular6Java

Current Environment has AngularCLI 6.2.3, node 10.16.3, npm 6.12.1, mvn 3.6.1, spring-boot 2.0.3.release

Node/Npm installed locally when running mvn clean package: 
1. nodeVersion: v8.9.0
2. npmVersion: 5.5.1

To run Application:
0. git clone repo
1. npm install in client folder(1. cd /client, 2.npm install)
2. mvn clean package in parent folder(3. cd.. or cd CarAppAngular6Java and 4. mvn clean package)
3. mvn spring-boot:run in server folder(5.cd /server, 6. mvn spring-boot:run)
4. go to http://localhost:8080/





## Docker image
1. docker pull romansokolovski/testing:1.0-SNAPSHOT
2. docker run -d -p 8080:8080 romansokolovski/testing:1.0-SNAPSHOT
3. go to http://localhost:8080/
