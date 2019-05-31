create table funcionario(
nome varchar(40),
telefone varchar(20),
cpf varchar(15) unique,
cargo varchar(20),
id serial,
constraint pk_funcionario primary key(id)
);

create table produto(
nome varchar(30),
valor float,
quantidade int,
id serial,
constraint pk_prod primary key(id)
);



create table extra(
descricao varchar(20),
id serial,
constraint pk_extra primary key(id)
);

create table hospede(
nome varchar(30),
email varchar(20),
cpf varchar(15) unique,
telefone varchar(15),
id serial,
constraint pk_hospede primary key(id)
);

create table quarto(
id serial,
diaria float,
acomodacoes int,
status varchar(20),
constraint pk_quarto primary key(id)
);

create table pedido(
id serial,
data_pedido date,
id_hospede int not null,
id_funcionario int not null,
id_produto int not null,
quantidade int,
primary key(id),
foreign key(id_hospede) references hospede(id),
foreign key(id_funcionario) references funcionario(id),
foreign key(id_produto) references produto(id));


create table quarto_extra(
id_quarto int not null,
id_extra int not null,
primary key(id_quarto,id_extra),
foreign key(id_quarto) references quarto(id),
foreign key(id_extra) references extra(id)
);

create table reserva(
id_hospede int not null,
id_quarto int not null,
id_funcionario int not null,
diaria float,
quant_dias int,
id serial,
constraint pk_reserva primary key(id),
constraint fk_hospede foreign key(id_hospede) references hospede(id),
constraint fk_quarto foreign key(id_quarto) references quarto(id),
constraint fk_funcionario foreign key(id_funcionario) references funcionario(id)
);

create table pagamento(
id_reserva int not null,
data_pg date,
valor float,
constraint fk_reserva foreign key(id_reserva) references reserva(id)
);

create table produto_pedido(
id_produto int not null,
id_pedido int not null,
quantidade int not null,
foreign key(id_produto) references produto(id),
foreign key(id_pedido) references pedido(id)
);
