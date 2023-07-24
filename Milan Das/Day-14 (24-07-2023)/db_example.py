"""
	SQL stands for Structured Query Language
	The commands in the SQL is divided into 3 categories
	1. DDL - Data Definition Language
		CREATE, DROP, ALTER, TRUNCATE
	2. DML - Data Manipulation Language
		INSERT, UPDATE, DELETE, SELECT
	3. DCL - Data Control Language
		REVOKE, GRANT, 

"""
import sqlite3

# Step-1: Create a connector object
conn = sqlite3.connect('student_info.db')

# Step-2: Create a cursor
curs = conn.cursor()

# Step-3: Execute SQL command
curs.execute("""
	CREATE TABLE addressbook(
		id          integer,
		first_name	text,
		last_name	text,
		address		text,
		location	text,
		email_id	text,
		mobile_no	integer,
		PRIMARY KEY(id)
	)
""")

curs.execute('INSERT INTO addressbook VALUES(1, "Debasis","Sahu","New Bus Stand","Berhampur","debasis2020@gmail.com","7656063213")')
curs.execute('INSERT INTO addressbook(id,first_name,last_name,address,location,email_id,mobile_no) VALUES(2,"Sandip","Nayak","Unit-IV","Bhubaneswar","sandipnayak2000@gmail.com","9978168568")')

conn.commit()
conn.close()
