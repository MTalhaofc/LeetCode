# Write your MySQL query statement below
Select id, movie, description, rating from cinema where id%2 !=0 and rating > 5 and description <> "boring" 
order by rating desc