1.Make sure the MySQL server is running on your laptop.
***mysql.server start
Starting MySQL
 SUCCESS!
2.Connect to the mysql server.
-*-Unless you set up your laptop differently, use the username root, and the password codeup.
****mysql -u root -p
****Enter password:codeup

Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.27 Homebrew
Copyright (c) 2000, 2021, Oracle and/or its affiliates.
Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

-*-What happens if you omit the -p option?
++++ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: NO)+++

3.Run the queries listed above one at a time by copying each individually and pasting it into the mysql prompt.

SELECT * FROM mysql.user
SELECT user, host FROM mysql.user
SELECT * FROM mysql.help_topic
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic

End each query with a ;.
Run the queries again but put \G at the end instead of ;.
Compare the output of the commands and why one method may be better than another.

**"\G"Outputs spreadsheet structure while ";" outputs table structure;
4.Issue the following command to MySQL:
pager less -~SFX

++++PAGER set to 'less -~SFX'++++

This will tell MySQL to use a pager for output. Specifically, we will specify the pager program named less. A pager is a terminal program designed to handle multiple pages of output.

Re-run the four queries above and notice how the output changes.

You can use the arrow keys to move around the display, and the space bar to jump to the next page of results. In addition, you can use the following keys to navigate in less:

d: go down a half page
u: go up a half page
j: scroll down one line
k: scroll up one line
/: search for a term
Regardless of how you navigate, press q to exit the pager.

5.Undo your previous setting with
nopager

6.Our next section will cover creating and managing users in MySQL. Start with help contents; and see if you can get a preview of what we will be covering next.


