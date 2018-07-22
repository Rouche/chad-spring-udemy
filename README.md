
# Chad Darby Spring & Hibernate for Beginners

http://www.luv2code.com/spring-5-whats-new
http://www.luv2code.com/spring-5-faq

## Lectures

### Java 9

    Section 20, Lecture 181

JUST A HEADS UP - FOR JAVA 9, 10 and 11 USERS

If you are using Java 9, 10 or 11, then you will encounter an error when you run your Hibernate program.

These are the steps to resolve it. Come back to the lecture if you hit the error.

----

Error: Exception in thread "main" java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException


This happens because of Java 9 and higher. 

Java 9 and higher has removed java.xml.bind from its default classpath. That's why we get the class not found exception.  We have to explicitly add JAR files to the build path.

---

Solution

For Java 9 and higher, you need to additional JAR files.

You need to download the following JAR files:

javax.activation-1.2.0.jar
jaxb-api-2.3.0.jar
jaxb-core-2.3.0.jar
jaxb-impl-2.3.0.jar

---

1. Download the files using links below:

javax.activation-1.2.0.jar

jaxb-api-2.3.0.jar

jaxb-core-2.3.0.jar

jaxb-impl-2.3.0.jar

---

2. Copy the JAR files to the lib folder of your project

javax.activation-1.2.0.jar
jaxb-api-2.3.0.jar
jaxb-core-2.3.0.jar
jaxb-impl-2.3.0.jar

---

Use the following steps to add the JAR files to your Java Build Path.

3. Right-click your project, select Properties

4. On left-hand side, click Java Build Path

5. In top-center of dialog, click Libraries

6. Click Classpath and then Click Add JARs ...

7. Navigate to the JAR files <your-project>/lib

Select the files:
javax.activation-1.2.0.jar
jaxb-api-2.3.0.jar
jaxb-core-2.3.0.jar
jaxb-impl-2.3.0.jar

8. Click OK then click Apply and Close

Eclipse will perform a rebuild of your project and it will resolve the related build/runtime errors.


====

Error: import of the javax.persistance.GenerationType saying its not accessible




You may still encounter problems for "import of the javax.persistance.GenerationType saying its not accessible"

To resolve this, apply the following steps

1. Right Click on the Project -> Properties - > Java Build Path.

2. Follow the steps as showed in the images below.

3. In Module Properties -> Select All in Available modules and move to Explicitly included modules.

4. Project->Clean... and Rebuild the Project and try again.



====

Note, if you are using Maven then you can add this to your POM file
```
<dependency>
   <groupId>javax.xml.bind</groupId>
   <artifactId>jaxb-api</artifactId>
   <version>2.2.8</version>
</dependency>

<dependency>
   <groupId>com.sun.xml.bind</groupId>
   <artifactId>jaxb-core</artifactId>
   <version>2.2.8</version>
</dependency>

<dependency>
   <groupId>com.sun.xml.bind</groupId>
   <artifactId>jaxb-impl</artifactId>
   <version>2.2.8</version>
</dependency>

<dependency>
   <groupId>com.sun.activation</groupId>
   <artifactId>javax.activation</artifactId>
   <version>1.2.0</version>
</dependency>

```