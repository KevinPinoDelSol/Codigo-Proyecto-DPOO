# Aprovisionamiento de Leche

## Datos generales

Este es el proyecto de DPOO de segundo semestre del curso de Ingenieria Informatica. Le permite administrar los datos y registros de una empresa de transporte de leche referentes a sus trabajadores, edificios y vehiculos, automatizar el proceso de pago y guardar la informacion de todos los procesos llevados a cabo.

- Lenguaje: java (7.51)
- Arquitectura: MVC
- Licencia: Apache

## Instalacion:
Para el uso de la aplicacion es necesario la instalacion de JRE 7.51 o superior. Puede encontrar el ejecutable en la carpeta `AprovisionamientoDeLeche/dist/` . No es necesaria ninguna instalacion adicional.

## Colaboradores:

* [KevinPinoDelSol](https://github.com/KevinPinoDelSol) 
* [Eduardo Jesus Abreu](https://github.com/eduardoCoder1112)

## Relacionados
25
Existe un proyecto externo  llamado Diagrama-aprovisionamiento-de-leche conteniendo el diagrama UML de este proyecto
https://github.com/KevinPinoDelSol/Diagrama-Proyecto-DPOO

## Modulos de los colaboradores

### Kevin
- Creado el proyecto del Netbeans e importado el codigo desde el visual pardigm
- Implementada la clase principal EmpresaAcopio. Esta clase ha sufrido muchisimas mejoras desde su estructura inicial en el UML. Ademas se le pusieron Regiones de codigo para mayor organizacion.
- Implementada la clase Persona, como la mayor abstracion y padre de todas las demas clases de trabajadores y usuarios
- Implementada la clase Secretaria
La secretaria es la encargada se registrar todos los datos de la empresa a sistema, asi como gestionar su eliminacion. 
 

- Implementadas todas las clases de Documentacion:
>RegistroDeMercancia
>
>RegistroDeEntrada
>
>
>RegistroDeRechazo
>
>Cheque

La clase cheque es una clase Nueva que tiene como objetivo guardar la informacion del pago a los ganaderos.

- Implementada la clase Almacen

   Con el objetivo de mejorar la escalabilidad del sistema
- Implementada la clase Contable.

  Un tipo de usuario el cual es el encargado de realizar el pago a los ganaderos
- Creada la carpeta de Excepciones y creada la excepcion de Usuario no encontrado.

  Esta ultima para usarse en el metodo de buscar el usuario segun su CI.
- Creada la excepcion de los campos de texto vacios.

  Para usarse en la interfaz de creacion de usuario
- Creada la interfaz de LogIn

  Para iniciar sesion al abrir el programa
- Creada la interfaz de creacion para todos los usuarios:

>Secretaria
>
>Contable
>
>Administrador
>
>Transportista
>
>Ganadero

- Creada la interfaz para mostrar todo tipo de datos. Consta de una tabla cuyas columnas cambian de forma dinamica mediante el metodo `private Object[][] setDatos(Object[] objetos, String tipo)` segun el dato que que se pide, por lo que pue puede mostrar tanto datos de trabajadores, documentacion o vehiculos.
- Creada la interfaz para registrar vehiculos
- Creada la intefaz relacionada con los contables y el pago de los cheques, incluida su barra de menu.

- Creada una interfaz que sale al abrir el programa en la que se le pide introducir el nombre de su Empresa para inicializar la base de datos
- Creada la interfaz de logIn para iniciar el programa, la cual sale una vez que se inicia el programa y ya existe una base de datos.
- Implementado el trabajo con archivos con sus metodos de guardar y cargar.
Al rellenar el formulario y continuar, el perfil creado iniciara automaticamente session para poder comenzar a registrar el resto de su Empresa.

### Eduardo
**pendiente**
