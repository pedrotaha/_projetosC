create table if not exists usuario(
 id serial not null primary key,
 nome varchar(50) not null,
 numeros int not null,
 salario float not null
);

create table if not exists numeros(
 id serial primary key not null,
 num int not null
);