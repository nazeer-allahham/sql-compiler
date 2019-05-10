select min(id ) as mmm, name
 from c full outer join ttt on c.id = ttt.id
  group by name