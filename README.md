# userApp

There are several ways to run a Spring Boot application on your local machine. 
One way is to execute the main method in the com.saravana.userApp.UserAppApplication class from your IDE.

Download the zip or clone the Git repository.
Unzip the zip file (if you downloaded one)
Open Command Prompt and Change directory (cd) to folder containing pom.xml
Open Eclipse
File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
Select the project
Choose the Spring Boot Application file (search for @SpringBootApplication)
Right Click on the file and Run as Java Application

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run

To test that it works, open a browser tab at http://localhost:8085/users .




