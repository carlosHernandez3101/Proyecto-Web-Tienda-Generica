create database bd_tienda_generica;
use bd_tienda_generica;
create table usuarios (
   usu_numero_cedula              numeric(15,0)                  not null,
   usu_nombre_completo            varchar(150)                    not null,
   usu_correo_electronico         varchar(50)                    not null,
   primary key (usu_numero_cedula)
);
create table cuenta (
   usu_numero_cedula              numeric(15,0)                  not null,
   cue_nombre_usuario             varchar(20)                    not null,
   cue_contrasenia                varchar(50)                    not null,
   primary key (cue_nombre_usuario),
   constraint fk_numero_cedula_usuario foreign key (usu_numero_cedula)
      references usuarios (usu_numero_cedula) on delete cascade on update cascade 
);
create table cliente (
cli_numero_cedula numeric(15,0) not null,
cli_nombre_completo varchar (150) not null,
cli_direccion varchar(50) not null,
cli_telefono numeric(10,0) not null,
cli_correo_electronico varchar(50) not null,
primary key (cli_numero_cedula)
);
create table proveedor(
prov_nit varchar(50) not null,
prov_nombre varchar(50) not null,
prov_dirrecion varchar(50) not null,
prov_telefono varchar(50) not null,
prov_ciudad varchar(50) not null,
primary key(prov_nit)
);
insert into usuarios values (1002958434, 'Carlos Enrique Hernandez Guerra', 'carlosguerra437@gmail.com');
insert into cuenta values(1002958434, 'admininicial', 'admin123456');

