select summarize(c.id),ttt.salary
from c join ttt on c.id = ttt.id
where c.id >2 and ttt.id >3