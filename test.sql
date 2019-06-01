select person.first_name , address.name
from person
join personAddress on personAddress.uid = person.id

join address on personAddress.aid = address.id and  address.id > 2

where personAddress.uid < 100