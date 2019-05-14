select c.id from c
where c.id >2 and c.salary = 2
and c.id in (select ttt.id from ttt where ttt.id >2 and ttt.id >3)
or c.id between 2 and 3