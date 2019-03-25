select t2.system_name, t3.device_name, count(1)
from t1 join t2 on t1.id = t2.system_id
        join t3 on t3.id = t2_device_id
group by t2.system_name, t3.device_name

