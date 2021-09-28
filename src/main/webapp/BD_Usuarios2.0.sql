create database BD_UsuariosTienda;
use BD_UsuariosTienda;
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
insert into usuarios values (1002958434, 'Carlos Enrique Hernandez Guerra', 'carlosguerra437@gmail.com');
insert into cuenta values(1002958434, 'admininicial', 'admin123456')