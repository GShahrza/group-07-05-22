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




SELECT c.name,sum(e.salary) from azercell.company c
                                     inner join azercell.employer E on c.id = E.company_id
group by c.id;


select  max(sa) from (select count(c.id) sa from azercell.employer C where  c.company_id is not null
                      group by  c.company_id having count(c.id)>0 )  Cs;



select e.surname, e.name from azercell.employer e order by  e.surname , e.name asc ;




select t.name , t.surname telebeSoyad , m.ad mellimAd , m.soyad mellimSoyad from azercell.telebe t
                                                                                     inner join azercell.telebe_muellim tm on t.id = tm.telebe_id
                                                                                     inner join azercell.muellim m on m.id = tm.muellim_id;


select  * from azercell.telebe t where t.created_date = '2022-07-28';


select  * from azercell.telebe t where t.created_date between '2022-01-28' and '2022-07-28';

select  to_char(t.created_date , 'dd.mm.yy') from azercell.telebe t where t.created_date between  to_date('01.07.2022','dd.mm.yyyy') and
                                                                              to_date('28.07.2022','dd.mm.yyyy');




select t.name from   azercell.telebe t
union all
select m.ad
from azercell.muellim m;



