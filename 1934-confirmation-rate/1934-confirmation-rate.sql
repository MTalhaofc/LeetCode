# Write your MySQL query statement below

select s.user_id , IFNULL(round(sum(action = 'confirmed')/count(*),2),0.00) as confirmation_rate
From Signups s
Left Join Confirmations c
on s.user_id = c.user_id
group by s.user_id