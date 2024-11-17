# ConversorDeMonedas

<header>Conversor de monedas</header>

<h1>Alura Latam Backend Challenge</h1>

<p><em>Descripcion del Proyecto</em></p>

<p>En este challenge se nos solicito crear un programa que convierta de una moneda a otra usando el <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a></p>

<p>El convertidor de monedas tiene la siguiente programacion:</p>
<ol>
  <li>Convertir de USD a ARS (dolar a peso argentino)</li>
  <li>Convertir de ARS a USD (perso argentino a dolar)</li>
  <li>Convertir de USD a BRL (dolar a real brasileno)</li>
  <li>Convertir de BRL a USD (real brasileno a dolar)</li>
  <li>Convertir de USD a COP (dolar a peso colombiano)</li>
  <li>Convertir de COP a USD (perso colombiano a dolar)</li>
  <li>Salir del programa</li>
</ol>

<div>
<h2>Entendiendo el programa</h2>
<div>
  <h3>Clase Moneda</h3>
  <p>
    Moneda es un Record que utilizamos para obtener la moneda base, la moneda final, el intercambio, y el resultado del cambio de divisas y que se usa en la clase de ExchangerateAPI para indicar la informacion que queremos obtener del API.
  </p>
</div>
  
<div>
  <h3>
    Clase ExchangerateAPI
  </h3>
  <p>
    Esta clase la utilizamos para hacer un "fetch" del Exchangerate-API utilizando nuestra propia API Key, usando GSon para crear la solicitud y obtener la informacion que deseamos
  </p>
</div>

<div>
  <h3>
    Clase MostrarResultados
  </h3>
  <p>
    Esta es una clase sencilla que va a mostrar los resultados de nuestro fetch una vez que hagamos la validacion en la clase principal.
  </p>
</div>

<div>
  <h3>Clase Principal</h3>
  <p>
    En la clase principal ejecutamos nuestro de codigo de validacion, inicializando todas las clases para obtener la informacion de la API, obtener el input del usuario para poder pasar la informacion de las monedas que queremos usar y a cual queremos convertir. En esta clase tambien hacemos la validacion de las opciones que se le otorga al usuario como elegir las divisas e ingresar el monto que quiere intercambiar.
  </p>
</div>

<div>
  <h3>Desarollado por</h3>
  <ul>
  <li><strong>Isaac Mena</strong></li>
</ul>
</div>
</div>
