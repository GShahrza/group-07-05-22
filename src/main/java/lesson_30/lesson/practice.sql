-- Company  ( id , name , created)
--Employer  (id , name , surname, age, title,  company_id)

create table azercell.Company
(
    id      int primary key,
    name    varchar(255) not null,
    created date default now()
);



create table azercell.Employer
(
    id         int primary key,
    name       varchar(255),
    surname    varchar(255),
    age        numeric(10),
    title      varchar(255),
    company_id int,
    FOREIGN KEY (company_id) REFERENCES azercell.company (id)

);

INSERT into azercell.company
values (2, 'Coders');
INSERT into azercell.company (id, name)
values (1, 'Emil');
UPDATE azercell.company
SET name = 'Azercell'
where id = 1;
ALTER TABLE azercell.company
    add unique (name);

insert into azercell.company
values (3, 'Coders');
insert into azercell.employer (id, name, surname, age, title, company_id)
values (1, 'Emil', 'Hasanov', 20, 'programist', 1);
insert into azercell.employer (id, name, surname, age, title, company_id)
values (2, 'Ayaz', 'Baxalov', 21, 'painter', 1);

ALTER TABLE azercell.employer
    add salary int;

UPDATE azercell.employer
set salary = 600
where name like 'N%';


SELECT c.name, count(e.age) iscilerin
from azercell.company c
         INNER JOIN azercell.employer E on c.id = E.company_id
group by c.name;

SELECT c.name, sum(e.salary)
from azercell.company c
         inner join azercell.employer E on c.id = E.company_id
group by c.id

SELECT c.name, count(e.age) iscilerin
from azercell.company c
         INNER JOIN azercell.employer E on c.id = E.company_id
group by c.name;

SELECT c.name, sum(e.salary)
from azercell.company c
         inner join azercell.employer E on c.id = E.company_id
group by c.id;


select max(sa)
from (select count(c.id) sa
      from azercell.employer C
      where c.company_id is not null
      group by c.company_id
      having count(c.id) > 0) Cs

