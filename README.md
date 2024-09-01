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
