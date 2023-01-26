# SLM_Test_Weidinger

Software Lifecycle Management
<Scenario> (e.g., Capital API)<br>
<Description> (e.g., We are a small Geo Company in Vienna. A client wants an API that returns the capital city of a requested country)<br>
<br>Project
<br>You should implement a REST-based server in Java (use Spring Boot). The service should be able to return the desired information using REST.

Prozess<br>
Gestartet wurde mit dem Anlegen der Workflows für Master und Develop.
Weiters wurde ein Kanbanboard erstellt und User Stories für unterschiedliche Features erstellt.
Dann wurde mit der Implementierung der Features begonnen.
Nach jedem Feature wurde online geprüft ob das aktuelle Feature die gewünschte "Funktion" ausführt.
Beim ersten Pull Request ist leider ein Fehler unterlaufen, bei dem dass Feature Austria fälschlicher Weise mit Master compared wurde anstatt mit Develop.
Dies wurde bei den restlichen Features richtigerweise umgeändert und die Features mit Develop compared.
Nach den Pull-Requests wurden die jeweiligen Feature Branches deleted.
Zum Abschluss wurde noch ein Artifact erstellt.

<br>Requirements
Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a Kanban board to manage your User Stories and use a git branching model (preferable gitflow) to manage your code. Track your development process by updating your Kanban board and write at least one unit tests for every requirement. A Continuous Integration pipeline that produces the finished software artifact should be implemented as well. Document
•	the whole process
•	the user stories
•	the repository URL
•	the usage of the software
in a Readme file with explanatory text. Submit the code (including the .git folder and ALM files) as a zip file (please put the Readme inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”
 
Points
•	Documentation of the process: 15%
•	Requirement definitions (User Stories): 15%
•	Correct status / Linking / Branching (Kanban, Git): 20%
•	Implementation: 15%
•	Pipeline (Continuous Integration and Maven): 20%
•	Artefacts (Continuous Delivery): 10%
All elements must be present in the documentation.

References
<Route Examples, etc>
(api/capital/Austria -> Vienna)
(api/capital/France -> Paris)
(api/capital/Italy -> Rome)


