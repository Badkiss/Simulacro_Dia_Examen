create database simulacro;
use simulacro;
create table COCHE(
cod int auto_increment primary key,
color varchar(10),
marca varchar(5));
create table ACCIDENTE(id int auto_increment primary key,
cod_coche1 int references COCHE(cod),
cod_coche2 int references COCHE(cod),
num_muertos int );