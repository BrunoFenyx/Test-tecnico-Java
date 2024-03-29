# Test Técnico Java - Sistema de Gestión de Facultad

Este repositorio contiene la solución a un test técnico ofrecido por PwC para el desarrollo de una aplicación de gestión de información para una facultad. La aplicación debe manejar datos sobre estudiantes, profesores y personal de servicio:

## Especificaciones de la Base de Datos:

   - Nombre: "test_tecnico"
   - Usuario: "root"
   - Contraseña: 1234
   - IP: "localhost"
   - Puerto: 3306
   - Driver: "mysql-connector-java-8.0.17.jar" 

## Detalles del Proyecto

A continuación, se detalla la información que la aplicación debe gestionar para cada tipo de persona:

- **Persona (empleados o estudiantes):**
  - Nombre/s
  - Apellido/s.
  - Número de identificación.
  - Estado civil.

- **Empleados (profesores o personal de servicio):**
  - Año de incorporación a la facultad.
  - Número de despacho asignado.

- **Estudiante:**
  - Curso en el que está matriculado.

- **Profesor:**
  - Departamento al que pertenece (p. ej., lenguajes, matemáticas, arquitectura).

- **Personal de Servicio:**
  - Sección a la que están asignados (p. ej., biblioteca, decanato, secretaría).

## Diagrama de Clases

El siguiente diagrama de clases representa la estructura de las clases principales y sus relaciones:

![Diagrama de clases](Diagrama1.png)

- **Student** hereda de **Person**.
- **Staff** hereda de **Person**.
- **Teacher** hereda de **Staff**.
- **ServiceStaff** hereda de **Staff**.

Adicionalmente, se presenta un diagrama de base de datos que ilustra las relaciones entre las entidades:

![Diagrama de base de datos](Diagrama2.png)

- **Student** mantiene una relación uno a uno con **Person**.
- **Staff** mantiene una relación uno a uno con **Person**.
- **Teacher** mantiene una relación uno a uno con **Staff**.
- **PersonalStaff** mantiene una relación uno a uno con **Staff**.

- **Student** mantiene una relación muchos a muchos con **Courses** a través de una tabla intermedia.
- **Teacher** mantiene una relación muchos a uno con **Department**.
- **PersonalStaff** mantiene una relación muchos a uno con **Section**.

## Funcionalidades y Bonus:

La implementación de las clases incluye los constructores y los siguientes métodos:

- Cambio del estado civil de una persona.
- Matriculación de un estudiante en un nuevo curso.
- Cambio de departamento de un profesor.
- Traslado de sección de un empleado del personal de servicio.

**Bonus:**
- Obtención de todos los profesores para algún departamento particular.
- Obtención de todos los estudiantes de un curso.

Adicionalmente, se han desarrollado tests que prueban la funcionalidad implementada mediante una interfaz gráfica para que resulte cómodo su uso.

## Detalles:

![estadisticas](Estadistica1.png)

- Los primeros recursos que se deben crear, son las secciones, los departamentos y los cursos, si no, no se podrán crear profesores, personal de servicios ni estudiantes.
- Las tablas en la base de datos se crean al iniciar el programa.
