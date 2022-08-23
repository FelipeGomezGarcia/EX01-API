# EX01-API

## URL de Herokku
https://ex01-api.herokuapp.com/

### Endpoints de Usuarios

  1- Obtener todos los Usuarios
  - GET /api/users
  
  2- Buscar usuario por username
  - GET /api/users/username/{username}
  
  3- Obtener usuario por id
  - GET /api/users/{id}
  
  4- Guardar un nuevo usuario con un request body
  - POST /api/users
  
  5- Actualizar los datos de un usuario
  - PUT /api/users/{id}
  
  6- Borrar un usuario
  - DELETE /api/users/{id}
  
### Endpoints de Mensajes

  1- Obtener todos los Mensajes
  - GET /api/mensajes
  
  2- Buscar mensajes por grupo
  - GET /api/mensajes/grupoId/{id}
  
  3- Obtener mensaje por id
  - GET /api/mensajes/{id}
  
  4- Guardar un nuevo mensaje con un request body
  - POST /api/mensajes
  
  5- Actualizar los datos de un mensaje
  - PUT /api/mensajes/{id}
  
  6- Borrar un mensaje
  - DELETE /api/mensajes/{id}

### Endpoints de Juegos

  1- Obtener todos los Juegos
  - GET /api/juegos
  
  2- Buscar juego por nombre
  - GET /api/juegos/nombre/{nombre}
  
  3- Obtener juego por id
  - GET /api/juegos/{id}
  
  4- Guardar un nuevo juego con un request body
  - POST /api/juegos
  
  5- Actualizar los datos de un juego
  - PUT /api/juegos/{id}
  
  6- Borrar un juego
  - DELETE /api/juegos/{id}
  
  ### Endpoints de Grupos

  1- Obtener todos los Grupos
  - GET /api/grupos
  
  2- Buscar grupo por nombre
  - GET /api/grupos/nombre/{nombre}
  
  3- Obtener grupo por id
  - GET /api/grupos/{id}
  
  4- Guardar un nuevo grupos con un request body
  - POST /api/grupo
  
  5- Actualizar los datos de un grupo
  - PUT /api/grupos/{id}
  
  6- Borrar un grupo
  - DELETE /api/grupos/{id}
   
### Endpoints de Pertenecer

  1- Obtener todos los grupos que pertences
  - GET /api/perteneces
  
  2- Obtener relacion por id
  - GET /api/perteneces/{id}
  
  3- Guardar una nueva relacion con un request body
  - POST /api/perteneces
  
  4- Actualizar los datos de un relacion
  - PUT /api/perteneces/{id}
  
  5- Borrar una relacion 
  - DELETE /api/perteneces/{id}
