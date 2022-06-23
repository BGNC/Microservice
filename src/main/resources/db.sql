CREATE KEYSPACE springcloud WITH REPLICATION ={'class':'SimpleStrategy','replication_factor':3};

use springcloud;
CREATE TABLE emp(
                    emp_id int primary key ,
                    emp_name text,
                    emp_city text,
                    emp_sal varint,
                    emp_phone varint
);

SELECT * FROM emp