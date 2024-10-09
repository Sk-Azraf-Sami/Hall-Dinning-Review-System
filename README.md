# HALL DINNING REVIEW SYSTEM (JAVA PROJECT - DESKTOP APPLICATION)
Install mysql 
Set name and password in ConeectionProvider.java 
1. sudo apt install mysql-server
2. sudo systemctl start mysql.service
3. sudo mysql
4. sudo mysql -u root -p 
5. mysql> show databases;
6. ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
7. exit
8. sudo mysql -u root -p 
9. Enter Password: password
10. sudo sanp install mysql-workbench-community 

ConeectionProvider.java 
after login to mysql: 
11. mysql> create database dms;
12. add mysql-connector-java-8.0.30.jar file to library 

13. use dms; 
    show tables; 
14. run tables.java
15. show tables; 




> create databse dms; 
javac -cp "../../jar-files/mysql-connector-java-8.0.30.jar" ConnectionProvider.java
java -cp "../../jar-files/mysql-connector-java-8.0.30.jar"  dao.ConnectionProvider

javac -cp "../../jar-files/mysql-connector-java-8.0.30.jar" DbOperations.java
javac -cp "../../jar-files/mysql-connector-java-8.0.30.jar" tables.java
java -cp "../../jar-files/mysql-connector-java-8.0.30.jar"  dao.tables

## Table of Contents 
- [Description](#description)
- [User Interface](#user-interface)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [How to Play](#how-to-play)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

## [Documentation](#documentation)

For detailed information about the Cardio Tracker app, please refer to the [docummentation](https://github.com/Sk-Azraf-Sami/SOS-Paper-Pencil-Game-AI/blob/main/sos-documentation.pdf).


## [Contributing](#contributing)

Thank you for your interest in contributing to the 'Hall-Dinning-Review-Desktop-Application'! We welcome contributions from everyone. To get started, please follow the guidelines below:

##### Bug Reports and Feature Requests

If you encounter any bugs or have ideas for new features, please open an issue on the GitHub repository. When opening an issue, provide as much detail as possible, including steps to reproduce the issue and any relevant information about your environment. This will help us investigate and address the problem more effectively.

##### Pull Requests

We gladly accept pull requests for bug fixes, enhancements, and new features. To contribute code to the project, follow these steps:

1. Fork the repository and create your branch from the `main` branch.
2. Make your changes, ensuring that your code adheres to the project's coding style and conventions.
3. Write tests to cover your changes and ensure the existing tests pass.
4. Ensure your code compiles without any errors or warnings.
5. Commit your changes and push your branch to your forked repository.
6. Open a pull request against the `main` branch of the original repository.
7. Provide a clear and descriptive title for your pull request and explain the changes you have made.
8. Be responsive to any feedback or questions during the review process.

By contributing to this project, you agree that your contributions will be licensed under the project's [MIT License](https://opensource.org/licenses/MIT).

##### Code Style and Conventions

To maintain consistency throughout the project's codebase, please adhere to the following guidelines:

- Use proper indentation and formatting.
- Follow naming conventions for variables, classes, and methods.
- Write clear and concise comments to improve code readability.
- Ensure your code is modular, reusable, and follows best practices.

##### Communication

If you have any questions or need assistance, feel free to reach out to the project maintainers or open an issue on GitHub.

We appreciate your contributions and look forward to working with you to improve desktop application!


## [License](#license)

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
