# SpringSecurity
Este proyecto utiliza Spring MVC y Spring Security para realizar lo siguiente:

1. Responder a las URLs: /servicioturismo, /serviciopremium, /login, /logout

2. Página de login para ingresar usuario y contraseña. La aplicación autentica los siguientes usuarios (todos los usuarios tienen la pass:"123":
  -"admin" el cual tiene permiso para entrar a todo.
  -"usertur" el cual solo puede entrar a /servicioturismo.
  -"userpre" el cual solo puede entrar a /serviciopremium.
 
3. La única forma de ingresar a /servicioturismo o /serviciopremium es mediante autenticación. Si un usuario no autenticado intenta ingresar a /servicioturismo o /serviciopremium,
la aplicación lo redirecciona a /login.

