/*
create table person
(
	id int,
    username varchar(255),
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);
*/
insert into person (id, username, location, birth_date) values (11, 'pat', 'New York', CURRENT_TIMESTAMP());
insert into person (id, username, location, birth_date) values (12, 'john', 'New Delhi', CURRENT_TIMESTAMP());
insert into person (id, username, location, birth_date) values (13, 'pat', 'Amsterdam', CURRENT_TIMESTAMP());