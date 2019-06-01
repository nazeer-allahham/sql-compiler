select person.first_name
from person
where person.last_name is null and person.id <100 or person.id in(1,2,3)
