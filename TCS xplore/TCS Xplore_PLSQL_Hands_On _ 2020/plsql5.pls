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
Enter your query below.
Please append a semicolon ";" at the end of the query
At end of the block , add '/'
*/
declare
    d_id employees.d_id%type;
    dept_id departments.dept_id%type;
    dept_name departments.dept_name%type;
    cursor d is select dept_id,dept_name from departments;
    cursor e is select distinct d_id from employees where designation='SE';
begin
    open e;
    loop
        fetch e into d_id;
        exit when e%notfound;
        open d;
        loop
            fetch d into dept_id,dept_name;
            exit when d%notfound; 
            if(d_id = dept_id) then
                dbms_output.put_line(dept_name);
            end if;
        end loop;
        close d;
    end loop;
    close e;

end;
/
exit;