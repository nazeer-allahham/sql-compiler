select min(c.id) , c.name
from c
group by c.name
having max(c.id)>2
order by c.id