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
    o_id Orders.C_ID%type;
    c_id Customers.ID%type;
    c_name Customers.Name%type;
    c_phone Customers.Contact_No%type;
    cursor o is select C_ID from Orders where QUANTITY > 200;
    cursor c is select ID,Name,Contact_No from Customers;
begin
    dbms_output.put_line('Customer_Id Customer_Name Customer_Phone');
open o;
loop
    fetch o into o_id;
    exit when o%notfound;
    open c;
    loop 
        fetch c into c_id,c_name,c_phone;
        exit when c%notfound;
        if(c_id=o_id) then
        dbms_output.put_line(c_id || ' ' ||c_name||' '||c_phone);
        end if;
    end loop;
    close c;
end loop;
close o;
end;

/
exit;