select contest_id ,
Round(count(distinct user_id)*100 / (select count(user_id) from Users),2) as percentage
from register
group by contest_id
order by percentage desc, contest_id