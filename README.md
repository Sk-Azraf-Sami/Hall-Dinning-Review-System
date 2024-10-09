# HALL DINNING REVIEW SYSTEM (JAVA PROJECT - DESKTOP APPLICATION)

![Version](https://img.shields.io/badge/Version-1.0-blue.svg?style=plastic&logo=appveyor&logoColor=white&color=blueviolet)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux-blue.svg?style=plastic&logo=windows&logoColor=white&color=green)
![IDE](https://img.shields.io/badge/IDE-NetBeans-brightgreen.svg?style=plastic&logo=apache-netbeans-ide&logoColor=white&color=yellowgreen)
[![GitHub contributors](https://img.shields.io/github/contributors-anon/Sk-Azraf-Sami/Hall-Dinning-Review-System?style=plastic&labelColor=&color=blue&logo=)](https://github.com/Sk-Azraf-Sami/Hall-Dinning-Review-System/graphs/contributors)
[![GitHub last commit (by committer)](https://img.shields.io/github/last-commit/Sk-Azraf-Sami/Hall-Dinning-Review-System?style=plastic&labelColor=&color=blue&logo=)](https://github.com/Sk-Azraf-Sami/Hall-Dinning-Review-System/commits/main)
[![GitHub language count](https://img.shields.io/github/languages/count/Sk-Azraf-Sami/Hall-Dinning-Review-System?style=plastic&labelColor=&color=blue&logo=)](https://github.com/Sk-Azraf-Sami/Hall-Dinning-Review-System/search?l=python&type=Code)
![GitHub repo size](https://img.shields.io/github/repo-size/Sk-Azraf-Sami/Hall-Dinning-Review-System?style=plastic)
![License](https://img.shields.io/badge/License-[MIT]-blue.svg?style=plastic&color=orange&logo=GitHub)



## Table of Contents 
- [Description](#description)
- [User Interface](#user-interface)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

## [Description](#description)
“Hall Dining Review” is a desktop app that will help a user to share his experience about hall dining. There is a problem that all hall boarders can’t give feedback to the dining manager. So, it is impossible for dining manager to upgrade or add any item to dining. This app will help both students and dining manager to communicate in an easy way in one platform! Hall administrators also get a summary of student reaction about hall dining…

## [User Interface](#user-interface)
![image](https://github.com/user-attachments/assets/4918e977-26bd-4266-85ed-30d1d0e5f4e8)

------------

![image](https://github.com/user-attachments/assets/3cbd86d4-e62c-4d67-bdf6-76336a852419)

---------------

![image](https://github.com/user-attachments/assets/12cd1e34-87be-439d-aa7b-f259bd4a65e0)

-------

![image](https://github.com/user-attachments/assets/2b312760-7887-4b63-8f63-e0566cc9776e)

------------------

![image](https://github.com/user-attachments/assets/424fbce2-18d5-406e-8ee4-9b3e21e2717a)

---------------

![image](https://github.com/user-attachments/assets/6c1e04d9-d077-438a-8fae-7bdc442c29c5)

-----------------

![image](https://github.com/user-attachments/assets/484de63e-7389-421d-9b44-905936cd5b53)

----------------

![image](https://github.com/user-attachments/assets/a30d1fd6-b77f-46c4-b673-d2be12b75b2f)

---------------

![image](https://github.com/user-attachments/assets/2e9df894-abb0-4748-95e2-75d3130b9f91)

--------------

![image](https://github.com/user-attachments/assets/15b2ff3a-6313-4adf-b09b-540e4bdb4312)

-----------

![image](https://github.com/user-attachments/assets/982ab7f4-3567-423e-b65d-5e46ef9e1bf8)

-----------

![image](https://github.com/user-attachments/assets/7b177d93-e8fc-4488-a655-9111f22f0d38)



## [Installation](#installation)

### 1. Install MySQL
   First, install and set up MySQL Server:
   ```bash
   sudo apt install mysql-server
   sudo systemctl start mysql.service
   sudo mysql
   ```
   Set the root password:
   ```bash
   sudo mysql -u root -p
   ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
   exit
   ```

### 2. Create the Database
   Access MySQL again to create and configure the database:
   ```bash
   sudo mysql -u root -p
   > Enter Password: password
   ```
   Now, create the database `dms` and use it:
   ```sql
   > create database dms;
   > use dms;
   > show tables;
   ```

### 3. Project Setup

1. Install `Netbeans IDE` from [here](https://netbeans.apache.org/front/main/index.html).
   
2. Clone the project repository and open it in NetBeans:
   ```bash
   git clone https://github.com/Sk-Azraf-Sami/Hall-Dinning-Review-System.git
   ```
      1. Open the project in NetBeans.
      2. Navigate to `Source Packages -> dao -> tables.java`.
      3. Run the file by pressing `Shift+F6`.

### 4. Verify Database Tables
   After running the application, go back to MySQL and verify the created tables:
   ```sql
   > show tables;
   ```


##  [How to Run](#how-to-run)

1. Open a terminal and navigate to the `Hall-Dinning-Review-System` project directory:
   ```bash
   cd Hall-Dinning-Review-System
   ```

2. Go to the `dist` folder:
   ```bash
   cd dist
   ```

3. Run the application using the following command:
   ```bash
   java -jar "Review_on_Hall_Dining.jar"
   ```

### Additional Notes
- If you encounter any issues during installation, please check the repository's [issues section](https://github.com/Sk-Azraf-Sami/Hall-Dinning-Review-System/issues) for solutions or to report a problem.
- Be sure to check for updates regularly to keep this desktop application running smoothly.

## [Documentation](#documentation)

For detailed information about the 'Hall-Dinning-Review-Desktop-Application', please refer to the [docummentation](Hall-Dining-Review-Java-Project.pdf).


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
