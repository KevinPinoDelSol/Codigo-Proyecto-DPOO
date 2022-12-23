# Aprovisionamiento de Leche

## Datos generales
Este es el proyecto de DPOO de segundo semestre del curso de Ingenieria Informatica. Le permite administrar los datos y registros de una empresa de transporte de leche referentes a sus trabajadores, edificios y vehiculos, automatizar el proceso de pago y guardar la informacion de todos los procesos llevados a cabo.

- Lenguaje: java (7.51)
- Arquitectura: MVC
- Licencia: Apache

## Instalacion:
Para el uso de la aplicacion es necesario la instalacion de JRE 7.51 o superior. Puede encontrar el ejecutable en la carpeta `AprovisionamientoDeLeche/dist/` . No es necesaria ninguna instalacion adicional.

## Uso y guia basica
Al abrir el programa, le aparece una interfaz en la que se le pide introducir el nombre de su Empresa. Luego debera rellenar un formulario con los datos de una de sus secretarias.

Al rellenar el formulario y continuar, el perfil creado iniciara automaticamente session para poder comenzar a registrar el resto de su Empresa.


## Colaboradores:

* [KevinPinoDelSol](https://github.com/KevinPinoDelSol) 
* [Eduardo Jesus Abreu](https://github.com/eduardoCoder1112)



## Relacionados
Existe un proyecto externo  llamado Diagrama-aprovisionamiento-de-leche conteniendo el diagrama UML de este proyecto
https://github.com/KevinPinoDelSol/Diagrama-Proyecto-DPOO


## Modulos de los colaboradores
### Kevin
- Creado el proyecto del Netbeans e importado el codigo desde el visual pardigm
- Implementada la clase principal EmpresaAcopio. Esta clase ha sufrido muchisimos cambios desde su estructura inicial en el UML. Ademas   se le pusieron Regiones de codigo para mayor organizacion.
- Implementadas las clases Persona, Trabajador, Usuario y Secretaria, con sus respectivos atributos constructores, getters y setters.
- Implementadas todas las clases de Documentacion(RegistroDeMercancia, RegistroDeEntrada, RegistroDeRechazo, Cheque). La clase cheque es - una clase Nueva que tiene como objetivo guardar la informacion del pago a los ganaderos.
- Implementadas las clases Almacen y Contable.
- Creada la carpeta de Excepciones y creada la excepcion de Usuario no encontrado.
- Creada la excepcion de los campos de texto vacios.
- Creada la interfaz de LogIn
- Creada la interfaz de creacion para todos los usuarios
- Creada la interfaz para mostrar todo tipo de datos. **(En desarrollo)**
- Creada la interfaz para registrar vehiculos

Lo siguiente que hare va a ser la intefaz relacionada con los contables y el pago de los cheques


### Eduardo
**pendiente**
