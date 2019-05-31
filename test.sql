select * from c
inner join users
on c.id = users.id
where c.id > 2 and users.id >= 3

declare x query = (select * from c where c.id in ( select users.id from users));

execute_query (x)