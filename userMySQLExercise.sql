1.Log in to the MySQL server.

2.Create a new user called joe that can log in from localhost. Give joe a memorable password. Do not grant any privileges to joe.

CREATE USER 'joe'@'localhost' IDENTIFIED BY 'password';
Query OK, 0 rows affected (0.04 sec)

Use the query we gave you at the beginning of the lesson to make sure joe has been created and has a password.
Exit mysql and then connect again as joe.
Try the same SELECT query again and see the results. What results are you getting? Why?
mysql> SELECT user, host FROM mysql.user;
ERROR 1142 (42000): SELECT command denied to user 'joe'@'localhost' for table 'user'

(NO PRIVILAGE WAS ASSINGED TO JOE)

Log out from mysql and then reconnect again as root

3.Create a new user named anne. Give anne her own password.

mysql> CREATE USER 'anne'@'localhost' IDENTIFIED BY 'password';

Grant all privileges to anne on mysql.user. Do not give her the ability to grant those privileges to others.

GRANT ALL ON *.* TO 'anne'@'localhost';

Exit, and then connect as anne.
Run the query to list all users from this lesson. Why does this work?

(ANNE HAS ADMIN PRIVLAGE BUT NOT HAVE ABILITY TO GRANT PRIVILAGES)

Create a user named sally and try to grant sally all permissions on the mysql.user table. Does this work?

ERROR 1045 (28000): Access denied for user 'anne'@'localhost' (using password: YES)

(DOES NOT WORK ANNE DOES NOT HAVE ABILITY TO GRANT PRIVILAGE)

Exit and reconnect as root.
4.Create a new user named jean. Give jean a sensible password.

CREATE USER 'jean'@'localhost';

Give jean read-only permissions to the entire database server.

GRANT SELECT ON *.* TO 'jean'@'localhost';

Refer back to the previous exercise, try those same select queries

SELECT user, host FROM mysql.user;

Copy and paste the following query.
INSERT INTO mysql.user (Host, User) VALUES ('localhost', 'randal');
ERROR 1364 (HY000): Field 'ssl_cipher' doesn't have a default value'
(JEAN ONLY HAVE READ-ONLY ACCESS!!!!)

5.Drop all our previous users:

joe
mark
anne
jean
sally

DROP USER 'joe'@'localhost';
DROP USER 'mark'@'localhost';
DROP USER 'anne'@'localhost';
DROP USER 'jean'@'localhost';
DROP USER 'sally'@'localhost';

6.Create a new database administrator.

CREATE USER 'ranchayasambath'@'localhost' IDENTIFIED BY 'password';

This user should have all permissions on all tables, as well as the ability to grant permissions to other users.

GRANT ALL ON *.* TO 'ranchayasambath'@'localhost' WITH GRANT OPTION;

The username should be the same as the username on your mac. You can run the command whoami (from your shell, not from mysql) to find this out if you are not sure.
Make sure to choose a password you will remember.
If you are trying to log in to MySQL as a user that has the same username as the user you are logged in to your computer as, you will not need to specify the -u option.

If you followed the above steps, you should be able to connect to MySQL with just:
mysql -p


