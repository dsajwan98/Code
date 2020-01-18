SET NULL "NULL";
SET FEEDBACK OFF;
SET ECHO OFF;
SET HEADING OFF;
SET WRAP OFF;
SET LINESIZE 10000;
SET TAB OFF;
SET PAGES 0;
SET DEFINE OFF;
SET SERVEROUTPUT ON;
/*
declare
    s Employees.Salary%type;
    n Employees.Name%type;
    cursor c is select Name,Salary from Employees;
begin
    open c;
    loop 
        fetch c into n,s;
        exit when c%notfound;
        if(s >=30000) then
            dbms_output.put_line(n ||' '||'Senior manager');
        elsif(s <30000 and s >=25000) then
            dbms_output.put_line(n ||' Middle manager');
        elsif(s<25000 and s >=20000) then
            dbms_output.put_line(n ||' Junior manager');
        else
            dbms_output.put_line(n ||' Team member');
        end if;
    end loop;
    close c;
end;
/

exit;

    for t in (select name,grade from Employees)
    loop 
       dbms_output.put_line(t.name || t.grade);
    end loop;

*/

alter table Employees add Grade varchar(255);
update Employees
set Grade='Senior manager' where Salary>=30000;
update Employees
set Grade='Middle manager' where Salary<30000 and Salary>=25000;
update Employees
set Grade='Junior manager' where Salary<25000 and Salary>=20000;
update Employees
set Grade='Team member' where Salary<20000;
select Name,Grade from Employees;
exit;