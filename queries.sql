CREATE TABLE ingredientes(
	id number not null,
	nome varchar2(80) not null,
	CONSTRAINT ingrediente_id_pk PRIMARY KEY (id)
);

CREATE SEQUENCE ingrediente_seq;

CREATE TABLE utensilios(
	id number not null,
	nome varchar2(80) not null,
	CONSTRAINT utensilios_id_pk PRIMARY KEY (id)
);

CREATE SEQUENCE utensilios_seq;

CREATE TABLE medidas(
	id number not null,
	nome varchar2(80) not null,
	abreveacao varchar2(10) not null,
	CONSTRAINT medidas_id_pk PRIMARY KEY (id)
);

CREATE SEQUENCE medidas_seq;
