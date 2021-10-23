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
create table proveedores(
prov_nit numeric(20,0) not null,
prov_nombre varchar(50) not null,
prov_dirrecion varchar(50) not null,
prov_telefono numeric(10,0) not null,
prov_ciudad numeric(20) not null,
primary key(prov_nit)
);
CREATE TABLE productos(
prod_codigo_producto bigint(20) not null,
prod_nombre  varchar(50) not null,
prov_nit numeric(20) not null,
prod_precio_compra double not null,
prod_iva_compra double not null,
prod_precio_venta double not null,
primary key (prod_codigo_producto),
constraint fk_prov_nit foreign key (prov_nit)
	references proveedores (prov_nit) on delete cascade on update cascade
);
create table ventas(
venta_codigo bigint(20) not null auto_increment,
cli_numero_cedula numeric(15,0) not null,
usu_numero_cedula numeric(15,0) not null,
venta_iva double,
venta_total double,
venta_valor double,
primary key(venta_codigo),
constraint fk_cli_numero_cedula foreign key (cli_numero_cedula) 
references cliente(cli_numero_cedula),
constraint fk_usu_numero_cedula foreign key (usu_numero_cedula) 
references usuarios(usu_numero_cedula)
);
create table detalle_ventas(
det_venta_codigo bigint(20) not null auto_increment,
cantidad_productos int(11),
prod_codigo_producto bigint(20) not null,
venta_codigo bigint(20),
valor_total double,
valor_venta double,
valor_iva double,
primary key(det_venta_codigo),

constraint fk_codigo_producto foreign key (prod_codigo_producto) 
references productos(prod_codigo_producto),

constraint fk_codigo_venta foreign key (venta_codigo) 
references ventas(venta_codigo)
);
insert into usuarios values (1002958434, 'Carlos Enrique Hernandez Guerra', 'carlosguerra437@gmail.com');
insert into cuenta values(1002958434, 'admininicial', 'admin123456');
