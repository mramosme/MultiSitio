DROP TABLE IF EXISTS contacto
;
DROP TABLE IF EXISTS galeria
;
DROP TABLE IF EXISTS negocio
;
DROP TABLE IF EXISTS zona
;
DROP TABLE IF EXISTS sitio
;

CREATE TABLE contacto
(
	id INTEGER NOT NULL AUTO_INCREMENT,
        nombre VARCHAR(100) NOT NULL,
	calle VARCHAR(50) NOT NULL,
	colonia VARCHAR(50) NOT NULL,
	telefono VARCHAR(50) NOT NULL,
	correo VARCHAR(50) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE UQ_contacto_id(id)
) 
;


CREATE TABLE galeria
(
	id INTEGER NOT NULL,
	idNegocio INTEGER NOT NULL,
	urlImagen VARCHAR(50) NOT NULL,
	estatus CHAR(1),
	fechaRegistro DATETIME,
	fechaBaja DATETIME,
	usuarioAlta VARCHAR(30),
	usuarioBaja VARCHAR(30),
	PRIMARY KEY (id),
	KEY (idNegocio)
) 
;


CREATE TABLE negocio
(
	id INTEGER NOT NULL AUTO_INCREMENT,
	idSitio INTEGER,
	idContacto INTEGER NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	descripcionCorta VARCHAR(50),
	descripcionLarga VARCHAR(150),
	urlLogotipo VARCHAR(50),
	estatus CHAR(1),
	ligaFB VARCHAR(50),
	ligaPagina VARCHAR(50),
	calificacion SMALLINT NOT NULL DEFAULT 0,
	wifi BOOL NOT NULL,
	estacionamiento BOOL NOT NULL,
	areaNinos BOOL NOT NULL,
	mascotas BOOL NOT NULL,
	PRIMARY KEY (id),
	UNIQUE UQ_negocio_id(id),
	KEY (idContacto),
	KEY (idSitio)
) 
;


CREATE TABLE zona
(
	id SMALLINT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	descripcion VARCHAR(150) NOT NULL,
	urlImagen VARCHAR(100),
	estatus CHAR(1),
	PRIMARY KEY (id),
	UNIQUE UQ_zona_id(id)
) 
;


CREATE TABLE sitio
(
	id INTEGER NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50),
	contacto INTEGER NOT NULL,
	domicilio VARCHAR(50),
	telefono VARCHAR(50),
	fechaRegistro DATETIME NOT NULL,
	estatus CHAR(1) NOT NULL,
	idZona SMALLINT,
	PRIMARY KEY (id),
	UNIQUE UQ_sitio_id(id),
	KEY (idZona)
) 
;





ALTER TABLE galeria ADD CONSTRAINT FK_galeria_negocio 
	FOREIGN KEY (idNegocio) REFERENCES negocio (id)
;

ALTER TABLE negocio ADD CONSTRAINT FK_negocio_contacto 
	FOREIGN KEY (idContacto) REFERENCES contacto (id)
;

ALTER TABLE negocio ADD CONSTRAINT FK_negocio_sitio 
	FOREIGN KEY (idSitio) REFERENCES sitio (id)
;

ALTER TABLE sitio ADD CONSTRAINT FK_sitio_zona 
	FOREIGN KEY (idZona) REFERENCES zona (id)
;


ALTER TABLE sitio ADD CONSTRAINT FK_sitio_contacto FOREIGN KEY (contacto) REFERENCES contacto(id);