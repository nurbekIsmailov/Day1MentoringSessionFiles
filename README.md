# Day1MentoringSessionFiles

In Automation, reporting plays an important role so we can generate the different type of HTML reports, XSLT report, Log files etc

Advantages of Logging in Selenium Scripts:

Grants a complete understanding of test suites execution
Log messages can be stored in external files for post execution scrutiny
Logs are an exceptional assistant in debugging the program execution issues and failures
Logs can also be reviewed to ascertain the application’s health by the stakeholders


baretail free tool


Step 1- Download log4j jar file


	<dependencies>

		<!-- https://mvnrepository.com/artifact/log4j/log4j -->
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>


		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.4.0</version>
		</dependency>
	</dependencies>
  
  Next Step:
  
  Create log4j.properties file in the project’s main directory. It should appear in the same level as the pom.xml file, for example.
  
  paste the contents of the log4j.properties file from this github folder
  
  


//Write a test case
//Create a logger instance:

Logger log=Logger.getLogger(“[ClassName]”);
 // configure log4j properties file
   
   PropertyConfigurator.configure("Log4j.properties");


//Add logger messages:


log.info("Url opened");

  
  
  Links to check out:
https://www.youtube.com/watch?v=-GkRuFU_sUg
https://github.com/discospiff/JavaFullStackEnterpriseWeb/blob/master/PlantPlaces/src/log4j.properties
http://learn-automation.com/how-to-create-log-files-in-selenium/

https://en.wikipedia.org/wiki/Log4j
