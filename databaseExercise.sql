1.Create a new database named testing123
CREATE DATABASE testing123;
2.List all databases, make sure your new database is in the list.
SHOW DATABASES;
3.Show the SQL to recreate your database.

SHOW CREATE DATABASE testing123;

4.Switch to your new database using the USE statement.

USE testing123;

5.Delete your new database.

DROP DATABASE testing123;

6.List all databases, make sure your new database is not in the list.

SHOW DATABASES;

7.Try dropping your database again, make sure the command succeeds even though the database is now missing.

DROP DATABASE IF EXISTS testing123;

8.Create a new database called codeup_test_db and user codeup_test_user.

CREATE DATABASE codeup_test_db;
CREATE USER 'codeup_test_user'@'localhost' IDENTIFIED BY 'password';

Give codeup_test_user all permissions only on codeup_test_db,Make sure to remember this new user''s password.

USE codeup_test_db;
GRANT ALL ON codeup_test_db.* TO 'codeup_test_user'@'localhost';

Very if permission is granted:
SHOW GRANTS for 'codeup_test_user'@'localhost';