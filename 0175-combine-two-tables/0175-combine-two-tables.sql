# Write your MySQL query statement below
SELECT firstname,lastname ,city,state from address RIGHT JOIN person ON Person.personId = Address.personId;