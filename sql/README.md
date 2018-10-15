##数据库相关
###Easy
####175. Combine Two Tables
><https://leetcode.com/problems/combine-two-tables/#/description>
	
 ``
select p.FirstName, p.LastName, a.City, a.State 
from Person p left outer join Address a 
                on p.PersonId=a.PersonId;
 `` 
####176.Second Highest Salary
><https://leetcode.com/problems/second-highest-salary/#/description>

``SELECT MAX(Salary) as SecondHighestSalary
from Employee
where Salary <
(select Max(Salary) from Employee);
``

####181.Employees Earning More Than Their Managers
><https://leetcode.com/problems/employees-earning-more-than-their-managers/#/description>

``
SELECT T1.NAME as Employee 
FROM Employee T1 INNER JOIN Employee T2 
ON T1.ManagerId=T2.Id AND T1.Salary>T2.Salary;
``

####182.Duplicate Emails
><https://leetcode.com/problems/duplicate-emails/#/description>
 
 ``
 select Email from Person group by Email having count(Email) >1;
 ``
 
####183.Customers Who Never Order
><https://leetcode.com/problems/customers-who-never-order/#/description>

``
select c.Name 'Customers'
from Customers c left join Orders o
    on c.Id = o.CustomerId
where o.CustomerId is null;
``

####196.Delete Duplicate Emails
><https://leetcode.com/problems/delete-duplicate-emails/#/description>

``
delete p1 from Person p1 inner join Person p2
where p1.Email = p2.Email 
and p1.Id>p2.Id;
``
####197.Rising Temperature
><https://leetcode.com/problems/rising-temperature/#/description>

``
select t2.Id
 from Weather t1 inner join Weather t2
 on t1.Temperature <t2.Temperature
 and to_days(t1.Date) = to_days(t2.Date)-1 ;
``
####595.Big Countries
><https://leetcode-cn.com/problems/big-countries/description/>  
``
select name ,population,area from World where area>3000000 or population>25000000;
``
####596.Classes More Than 5 Students
><https://leetcode-cn.com/problems/classes-more-than-5-students/description/>
``
SELECT class from courses group by class having count(distinct student) >= 5;
``
####620.Not Boring Movies
><https://leetcode-cn.com/problems/not-boring-movies/description/>
``
select * from cinema where id%2=1 and description <>'boring' order by rating desc;
``
####627.Swap Salary
><https://leetcode-cn.com/problems/swap-salary/description/>
``
update salary set sex = if(sex = 'm', 'f','m');
``


