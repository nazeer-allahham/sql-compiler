select summarize(c.id),max(c.id),c.name
from c
where c.id between 1 and 9
or c.id in (1 , 2)
and c.id > 2
group by c.name