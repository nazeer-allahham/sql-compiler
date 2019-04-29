
SELECT id, name,count(*)
FROM c

GROUP BY id, name,f,sum(id);