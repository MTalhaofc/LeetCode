Select s.student_id, s.student_name , sub.subject_name,
count(e.subject_name) as attended_exams
from Students s
Cross Join Subjects sub
Left join Examinations e
on s.student_id = e.student_id And sub.subject_name = e.subject_name
Group by s.student_id, s.student_name , sub.subject_name
order by s.student_id , sub.subject_name