create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)	
);

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Sierra', 'New Orleans', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'Dexter', 'New Jersey', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Paul', 'New York', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Rachel', 'Washington DC', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10005, 'Ross', 'Washington DC', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10006, 'Monice', 'Washington DC', sysdate());

