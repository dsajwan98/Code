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

declare
total_score Scores.Score%type;
cursor c is select SUM(Score) from Scores where Score<100;
begin
open c;
fetch c into total_score;
dbms_output.put_line('Total='|| total_score);
close c;
end;
/
exit;