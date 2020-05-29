CREATE TABLE department
(	
	id integer not null,
	dep_id integer not null,
	dept_name varchar(255) not null,
	salary integer
);

INSERT INTO department (id, dep_id, dept_name, salary)
VALUES (10001, 101, 'Accounts', 36000);

INSERT INTO department (id, dep_id, dept_name, salary)
VALUES (10002, 102, 'Infrastructure', 75000);

INSERT INTO department (id, dep_id, dept_name, salary)
VALUES (10003, 101, 'Accounts', 38000);

INSERT INTO department (id, dep_id, dept_name, salary)
VALUES (10009, 103, 'Engineering', 66000);

INSERT INTO department (id, dep_id, dept_name, salary)
VALUES (10008, 104, 'Research', 78000);