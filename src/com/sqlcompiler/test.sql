select n.id, m.name, m.age
from mhd n, moz m
where
n.id = m.id
and n.name like 'a_%'
or n.age in (12, 15)