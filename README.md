# ENTERPRISE.ES - PRUEBA JAVA #

Gived the following UML diagram:
![Diagram.png](https://github.com/rsta80/TestJavaSenior/blob/master/TestJavaSenior/DiagramTest.png)

It's necessary to create the classes, variables, methods to model the diagram. Also it's necessary the following behavior:

* As it's usuaal, haven't referenced the **getters y setters** methods of the attributes classes in the diagram.
* The method **list()** should generate a list with the teachers of the department in alphabetic sort, by last name.
* The method **addProfessor(Professor)** must not add two repeated teachers, for this reason it's necessary to keep in mind the full name of the teacher.
* The method **addProfessor(Professor)** should check if the Department and DepartmentName match.
* If it's created an **ActingProfessor**, with the date less than the present date, it should throw the corresponding exception and handled correctly throwing
by the output of the system. 
* The method **getCompleteName()** must string name and last name like: 'last name, name'
* The method **getAge()** should calculate the age of the person y return as integer.
* Any text parameter, shouldn't exceed of 20 characters, or been empty. Otherwise is expected an exception. 


To control these behavior there's the project frame in the repository with a class with *Unit Tests* criteria, they have to ** be approbed correctly**. 

# Delivery Instructions #
It's requested to continie the following steps to deliver the test:

1. Create the solution compatible with the restricted requests.
2. Execute throught the command console "mvn clean" by the root path of the test.
3. Package into zip file the folder with the solution code and send to [arst80@gmail.com](mailto:arst80@gmail.com)

Any related question about the test please contact me :)