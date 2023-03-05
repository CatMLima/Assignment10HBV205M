A sample project with JUnit 4 showcasing JUnit 4 testing, including test suites and test coverage. 

This project is a Maven project that can be cloned via `git clone` and at the same time also be used as IDE projects.

The files in `.settings`, `.classpath`,  `.project` are specific for the Eclipse IDE, you can ignore them.


`mvn test` runs all test cases declared in class `AllTests` and creates via JaCoCo a test coverage report that can be found in `target/site/jacoco/`. 

If you want to use this project with a Java IDE:
- IntelliJ: Start a new project from version control, i.e. clone this project. IntelliJ should notice that this is an Eclipse project and a Maven project and asks you about the project style to use. It does not matter what you chose, because both styles give you exactly the same project setup.
- Visual Studio Code: Clone it (Help -> Show All Commands -> Type in: `Git: Clone`. This should be enough.
- Eclipse: see steps below:

Import to Eclipse via: 

1. File 
1. Import 
1. Git
1. Projects from Git *(Note: do __not__ use "with smart import")* 
1. Next
1. *Select* Clone URI
1. *paste Clone URI as* URI
1. Next *(i.e.* import `main` branch *)*
1. Next *(to confirm your local directory location to clone to)*
1. Next *(to confirm* Import existing Eclipse projects *)*
1. Finish

This should have given you a new project: `junit5demoWithMaven`

In Eclipse, you can run test cases using Eclipse's GUI test runner (Run as > JUnit Test) or via Maven (Run as > Maven test) or simply use Maven on the command line (but be aware that Eclipse caches files and does not notice if you change files outside of Eclipse unless you press F5 to refresh).

Note that the libraries are expected to be downloaded by Maven. If you have not Maven installed then, your IDE cannot do that. However, for the JUnit library, IDEs typically provide a quickfix to add on their own JUnit.
