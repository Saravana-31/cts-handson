create database bank;
use bank;
create table accounts(accountid int primary key, customername varchar(50), accounttype varchar(20),balance decimal(10,2));
INSERT INTO Accounts VALUES
(101,'Ramesh','Savings',50000),
(102,'Suresh','Savings',25000),
(103,'Priya','Current',80000),
(104,'Meena','Savings',40000),
(105,'Arun','Current',30000);
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(50),
    Department VARCHAR(30),
    Salary DECIMAL(10,2)
);
INSERT INTO Employees VALUES
(1,'Kumar','IT',50000),
(2,'Divya','IT',60000),
(3,'Ravi','HR',45000),
(4,'Anu','HR',55000),
(5,'Manoj','Finance',70000);
select * from accounts;
select * from employees;

-- scenario 1=> apply 1% interest to all savings accounts
delimiter $$
create procedure processmonthlyint()
begin update accounts set balance=balance+(balance*0.01) where accounttype='Savings'; end$$ 
delimiter ;
call processmonthlyint();

-- scenario 2=> apply 1% interest to all savings accounts
delimiter $$
create procedure updateemployeebonus(
in dept_name varchar(30),
in bonus_percent decimal(5,2)
)
begin update employees set salary=salary+(salary*bonus_percent/100) where department=dept_name; end $$
delimiter ;
call updateemployeebonus('IT',10);

-- scenario 3=> transfer funds between accounts
delimiter $$
create procedure transferfunds(
in fromacc int,
in toacc int,
in amount decimal(10,2)
)
begin declare sourcebal decimal(10,2);
select balance into sourcebal from accounts where accountid=fromacc;
if sourcebal>=amount then update accounts set balance=balance-amount where accountid=fromacc;
update accounts set balance=balance+amount where accountid=toacc;
select 'Transfer Successful' as message;
else
select 'Transfer Unsuccessful' as message;
end if;
end $$;
delimiter ;
call transferfunds(104,105,40000);