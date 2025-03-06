A sample project with JUnit 4 showcasing JUnit 4 testing, including test suites and test coverage. 

This project can be cloned via `git clone` and is a Maven project and at the same time can also be used as IDE project.

The files in `.settings`, `.classpath`,  `.project` are specific for the Eclipse IDE, you can ignore them.

`mvn test` runs all test cases in classes ending with `Test`. 

If you want to use this project with a Java IDE:
- IntelliJ: Start a new project from version control, i.e. clone this project. IntelliJ should notice that this is an Eclipse project and a Maven project and asks you about the project style to use. Inn case of doubt, choose `Maven`.
- Visual Studio Code: Clone it (Help -> Show All Commands -> Type in: `Git: Clone`. This should be sufficient.
- Eclipse: see steps below:

Import to Eclipse via: 

1. File 
1. Import 
1. Git
1. Projects from Git *(Note: do __not__ use "with smart import")* 
1. Next
1. *Select* Clone URI
1. Next *(to confirm the selcon using a Clone URI)*
1. *paste Clone URI as* URI (you have the URL already in the copy buffer it is automatically filled in)
1. Next *(to confirm using that URI)*
1. Next *(i.e.* import `main` branch *)*
1. Next *(to confirm your local directory location to clone to)*
1. Next *(to confirm* Import existing Eclipse projects *)*
1. Finish

This should have given you a new project: `MoneyStackWithMaven`

In Eclipse, you can run test cases using Eclipse's GUI test runner (Run as > JUnit Test) or via Maven (Run as > Maven test) or simply use Maven on the command line outside of Eclipse (but be aware that Eclipse caches files and does not notice if files change outside of Eclipse: you need to press F5 to refresh).

Note that in principle, the libraries are expected to be downloaded by Maven. However, if you have not Maven installed, then your IDE cannot tell Maven to download the libraries. However, as all needed libraries are anyway in addition contained in directory `lib`: VS Code should search automatically in that directory for libraries and in IntelliJ, select the `lib` directory->Right mouse button->Add as Library...->OK. (And as this is an Eclipse project, Eclipse should automatically use these libraries.)
