# <h1 align="center">TheArtCafe Backend</h1>

# Running TheArtCafeBackend Locally
TheArtCafebackend is a [Spring Boot](https://spring.io/projects/spring-boot) application built using [Maven](https://maven.apache.org/). 
You can build a jar file and run it from the command line:
```$xslt
 git clone https://github.com/AkshayDalavai/TheArtCafe.git
 cd theartcafebackend
 ./mvnw package
 java -jar target/*.jar
```
You can then access theartcafebackend here: http://localhost:8080/

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that 
you make in the project immediately (changes to Java source files require a 
compile as well - most people use an IDE for this):
```$xslt
./mvnw spring-boot:run
```

# Running TheArtCafeBackend using IDE
**Prerequisites** <br>

The following items should be installed in your system:<br>

1. Java 8 or newer.
2. git command line tool (https://help.github.com/articles/set-up-git)
3. IntelliJ IDEA <br>
    Windows -> https://www.jetbrains.com/idea/download/#section=windows <br>
    Mac -> https://www.jetbrains.com/idea/download/#section=mac <br>
    Linux -> https://www.jetbrains.com/idea/download/#section=linux
    
**Steps** <br>
1. On Command Line
    ```$xslt
    git clone https://github.com/AkshayDalavai/TheArtCafe.git
    ```
2. Inside IntelliJ
    ```$xslt
    File -> Open and select theartcafebackend `pom.xml`. Click on Open button -> Open as Project
    ```
3. A run configuration named `TheArtCafeBackendApplication` should have been created for you if you're using a recent 
Ultimate version. Otherwise, run the application by right clicking on the `TheArtCafeBackendApplication` main class and 
choosing `Run 'TheArtCafeBackendApplication'`.

4. Navigate to TheArtCafe <br>
    Visit http://localhost:8080 in your browser.
    
**DataBase Configuration** <br>




