
Select e1.name
From Employee e1
Inner Join Employee e2 
on e1.id = e2.managerId
group by e2.managerId 
having count(e2.managerId) >= 5