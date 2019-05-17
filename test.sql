SELECT c.name, COUNT(DISTINCT c.id), SUM(c.id)
FROM c
FULL OUTER JOIN users
ON c.id = users.id
GROUP BY c.name
ORDER BY 1;