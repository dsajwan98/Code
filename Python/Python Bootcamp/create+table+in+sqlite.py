'''
import sqlite3
try:
    conn = sqlite3.connect("database.db")
    cursor=conn.cursor()
    print("Database Connection and creation is successfully created")
    cursor.close()

except sqlite3.Error as error:
    print("Error in creating Database")
finally:
    if(conn):
        conn.close()
        print("Sqlite connection is closed") 
_____________________________________
import sqlite3
try:
    conn = sqlite3.connect("database.db")
    cursor=conn.cursor()
    conn.execute(''' #CREATE TABLE STD(stdid INTEGER PRIMARY KEY AUTOINCREMENT,
    #name TEXT(20) NOT NULL, age INTEGER, Dept TEXT(20));''')
    #print("table in the database s successfully created")
   # cursor.close()

#except sqlite3.Error as error:
   # print("Error in creating Database")
#finally:
    #if(conn):
       # conn.close()
       # print("Sqlite connection is closed") '''

import sqlite3
try:
    conn = sqlite3.connect("database.db")
    createtable=''' CREATE TABLE Dept(deptid INTEGER PRIMARY KEY AUTOINCREMENT,
    deptname TEXT(20) NOT NULL, deptstr INTEGER, Deptprograms TEXT(20));'''
    cursor=conn.cursor()
    cursor.execute(createtable)
    conn.commit()
    print("Database table are created successfully")
    cursor.close()

except sqlite3.Error as error:
    print("Error in creating Database",error)
finally:
    if(conn):
        conn.close()
        print("Sqlite connection is closed")
