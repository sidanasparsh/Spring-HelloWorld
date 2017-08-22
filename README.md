# Spring-HelloWorld

Description:

In this lab, you build a HelloWorld Java console application with Spring’s application context.

You will create a greeting bean with the ID “greeter”, which must be specified in your application context’s configuration file, named beans.xml. The class of the greeting bean implements the following interface:

interface Greeter { void setName(String name); // names of the author String getGreeting(); }

The value of the name property should be specified in beans.xml as well.

After instantiating the application context, your applications gets the greeting bean by its ID, calls its getGreeting() method to get the greeting message, and prints it on the console.



If the author is Alice, the greeting message should be “Hello world from Alice!”

Student Details: Name: Sidharth Bhasin

# Steps to run:

1) Download and unzip the project.
2) Add the required Spring Framework Libraries to run the Spring application. If you’re using Eclipse IDE, follow these steps:
Right click on project->Build Path-> Configure Build Path->  Java Build Path -> Add External Jars -> Select the Jar files -> Apply - > Ok.
3) Click on Run.

4) Results will be displayed on the console.
