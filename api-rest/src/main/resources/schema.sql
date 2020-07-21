
-- DROP DATABASE vuttr-api-rest;

CREATE DATABASE vuttr-api-rest;

CREATE SCHEMA vuttr;

CREATE TABLE vuttr.usuario
(
  id bigserial NOT NULL PRIMARY KEY,
  nome character varying(150),
  email character varying(100),
  senha character varying(20)
);

CREATE TABLE vuttr.ferramenta
(
  id bigserial NOT NULL PRIMARY KEY ,
  nome character varying(100) NOT NULL,
  descricao character varying(100) NOT NULL,
  links character varying(100) NOT NULL
);

CREATE TABLE vuttr.perfil
(
  id bigserial NOT NULL PRIMARY KEY ,
  nome character varying(100) NOT NULL
);

CREATE TABLE vuttr.tag
(
  id bigserial NOT NULL PRIMARY KEY ,
  id_ferramenta bigint REFERENCES vuttr.ferramenta (id),
  descricao character varying(100) NOT NULL
);
