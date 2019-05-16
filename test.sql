select max (c.id) , c.name
from c join ttt
on c.id = ttt.id
join users on c.id = users.id
where c.id <3 and c.salary<0
or c.id in (-1,-9)
GROUP by c.name ,c.id
order by c.id ,c.name
d