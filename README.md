## Grupo 13

Jeyson Alejandro Pereira
Willian Alexander Franco Reyes

URL Firebase: https://reto-sofka-questions.web.app/preguntas
URL Heroku: https://reto-sofka-questions.herokuapp.com/

GitHub: https://github.com/jeyson-pereira/retoEmpresarial

## Observaciones

El repositorio cuenta con un proyecto de backend y de frontEnd, este ultimo se encuentra dentro de la carpeta WEB.

En este directorio FrontyEnd se debera realizar la instalacion de npm , para las dependencias, asi con el CLI de angular.

## Caracteristicas desarrolladas

## 1. Consumo del back-end actual

Se consume el backend proporcionado en el proyecto y las peticiones realizadas son las esperadas en el proyecto

## 2. Uso adecuado de rutas

Se inicializa la aplicación Front con las rutas adecuadas y en correcto funcionamiento y navegabilidad (Login, respuestas, respuesta/{id}), etc

## 3. Logueo usuario/contraseña

![image](https://user-images.githubusercontent.com/61658807/173242539-301163f2-e29f-4314-8d26-1db0dbf53531.png)

 
Se implementa sistema de Login a través de usuario y contraseña, apoyados con los servicios de firebase.

## 4. Autenticación de Gmail

![image](https://user-images.githubusercontent.com/61658807/173242576-4059a1c8-65a9-40b7-8015-723945b03378.png)

	 
Se habilita el servicio ya establecido en frontEnd, que permite realizar una autenticación a través de una cuenta de Gmail. Se adiciona componente “Button” para que se interactúe con el usuario.

## 5. Restablecer contraseña
	
 ![image](https://user-images.githubusercontent.com/61658807/173242585-07511c7b-e088-44f7-b7c2-34b111ecf16f.png)
![image](https://user-images.githubusercontent.com/61658807/173242607-142115ab-d67d-4e64-9034-2c558f19d3a5.png)

Se habilita la funcionalidad de recuperar contraseña a través de servicios firebase. A la cuenta de correo electrónico ingresada se envía un enlace para recuperación de credenciales.

## 6. Editar respuestas
 
 ![image](https://user-images.githubusercontent.com/61658807/173242615-0e84f6a3-be29-4f6f-a26d-4d28a4849dab.png)
![image](https://user-images.githubusercontent.com/61658807/173242625-73a825e7-26a0-49f8-898d-75172926e89c.png)
 
Se implementa funcionalidad para editar una pregunta realizada, de la misma manera se implementa la funcionalidad para poder editar una respuesta a una pregunta dentro del “foro”. Se implemento la funcionalidad de mostrar fecha y hora de la respuesta, así coma la fecha y hora de su edición.

## 7. Scroll infinito de respuestas
	 
![image](https://user-images.githubusercontent.com/61658807/173242636-eaa0d5a7-0834-477f-9ae8-9c336ce335c1.png)
![image](https://user-images.githubusercontent.com/61658807/173242641-f097b4bc-2c59-4133-aefc-18c0d3f2716a.png)

 
Se implementa la funcionalidad para realizar un scroll infinito al componente de respuestas asociadas a una pregunta. Dentro de la lógica se establece la carga dinámica de 3 elementos en el listado.

## 8. Páginador de Preguntas
	
 ![image](https://user-images.githubusercontent.com/61658807/173242649-9dbafc78-0f5a-4a12-9a35-4ace9e8d0f55.png)

Se crean los endpoints en el backend para la paginación de resultados de preguntas. Desde el Front se habilita la funcionalidad para visualizar la paginación correspondiente.

## 9. Uso adecuado de Observable en Angular

Se hace un uso adecuado de observable, en los servicios implementados para obtener los resultados de los edpoints definidos en el backend, se obtiene de manera correcta los datos de acuerdo al observable definido.
	
## 10. Uso de algún frameworks o preprocesador CSS

![image](https://user-images.githubusercontent.com/61658807/173242665-f1b7cd7d-b549-4769-b451-054311433478.png)

	 
Se realiza la instalación de Bootstrap a través de npm para dar estilos a los componentes en el frontEnd, como botones o formularios.

## 11. Uso de Swagger

 ![image](https://user-images.githubusercontent.com/61658807/173242676-5ca2dfd5-bd81-4378-bda1-8270e0e07056.png)


Se implementa la dependencia para trabajar con OpenAPI y poder realizar la documentación correspondiente con swagger.

## Pruebas y Test

Se implementaron los test Unitarios del backend

 ![image](https://user-images.githubusercontent.com/61658807/173242680-2648905c-2a58-45b5-80af-becf9f6fba75.png)

Se implementan los test Unitarios del FrontEnd

![image](https://user-images.githubusercontent.com/61658807/173242693-99424c3b-5355-46b3-9023-bf6c90f72adb.png)
![image](https://user-images.githubusercontent.com/61658807/173242703-9dc7fdab-4f7b-4dbe-b02c-a80215bb0330.png)


 


