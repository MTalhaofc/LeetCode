# Write your MySQL query statement below
select p.product_id , IFNULL(Round(sum(p.price * u.units)/sum(units),2),0) as average_price
from Prices p
Left join UnitsSold u
on p.product_id = u.product_id and 
u.purchase_date Between start_date And end_date
group by product_id
