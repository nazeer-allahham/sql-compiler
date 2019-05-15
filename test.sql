select max(c.id) ,c.name
from c
where c.id >2
and c.id in (2,3)
or c.id in(select ttt.id from ttt where ttt.id>8)
group by c.name

