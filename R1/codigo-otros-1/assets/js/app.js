const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); //Agregar "." para referenciar el elemento del HTML cuya clase es name
const $b = document.querySelector('#blog');
const $l = document.querySelector('.location');

//Agregar la función async, debido a que las funciones await solo se permiten en funciones asincronas
async function displayUser(username) {
  $n.textContent = 'cargando...';

  try { //Petición. Hacía falta hacer uso de una porque se esta trabajando con fetch
    const response = await fetch(`${usersEndpoint}/${username}`);
    const data = await response.json();

  console.log(data); //Response se cambia por Data
  $n.textContent = `${data.name}`; //Sustituir las comillas por backtics, que permiten que una cadena abarque varias líneas e insertar expresiones 
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;

} catch (err) { //Error. Cuando se trabaja con peticiones, debe haber un try y un catch
  handleError(err);
}
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  $n.textContent = `Algo salió mal: ${err}` //No esta definido previamente n
}

displayUser('stolinski').catch(handleError);