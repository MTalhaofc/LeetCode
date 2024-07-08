Select w2.id from Weather w1 join Weather w2 on date_sub(w2.recordDate, interval 1 day) = w1.recordDate
 And w2.temperature > w1.temperature;