select * from c join ttt on c.id = ttt.id and c.id >2 join users on c.id =users.id
where c.id>2 and c.salary=2 or ttt.id =2