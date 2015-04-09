To rebuild the update site run:

"mvn clean install"

via Maven 3

in the terminal/bash/console in directory "no.hib.dpf.text.releng".
 
Currently the command build the plugin without running the XText generator.
It is assumed that they are generated via the Eclipse IDE (Luna). 
 
If it is desired to also generate all the XText generated files via the maven script, 
extend the pom.xml's correspondingly to the example you find here:

https://github.com/xtext/maven-xtext-example


*********************************************************************************
NOTE: Since Scala is used in the plugin, the PDE build will not work!!!
      Therefore Maven scripts are provided.
      However, running the plugin in a Runtime Eclipse environment is working.
*********************************************************************************