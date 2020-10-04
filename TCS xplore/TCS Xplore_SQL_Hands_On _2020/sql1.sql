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


select d.deptName,count(e.eDeptId) from departments d inner join employees e on d.deptId=e.eDeptId group by (d.deptName,e.eDeptId);

exit;