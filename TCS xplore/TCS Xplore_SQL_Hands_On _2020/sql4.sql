SET NULL "NULL";
SET FEEDBACK OFF;
SET ECHO OFF;
SET HEADING OFF;
SET WRAP OFF;
SET LINESIZE 10000;
SET TAB OFF;
SET PAGES 0;
SET DEFINE OFF;

select distinct d.dept_name, e.emp_skill from departments d inner join employees e on d.dept_id=e.emp_dept_id; 

exit;