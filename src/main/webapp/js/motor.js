function ajaxGet1(tipo,b1,d1,controller1)
{
    let ajax1 = new XMLHttpRequest();

    ajax1.onreadystatechange = function()
    {

        //console.log(ajax1.readyState);

        if(ajax1.readyState == 4 && ajax1.status == 200)
        {
            //document.getElementById(d1.id).innerHTML=this.responseText;
            d1.innerHTML=this.responseText;
            //tipo.value="";
            //console.log(this.responseText);
        }
        else
        {
            document.getElementById(d1.id).innerHTML = "Error";
            //console.log(this.responseText);
        }
    };
    //ajax1.open("GET","UserController?c1=" + c1.value + "&c2=" + c2.value + "&c3=" + c3.value, true);
    let argumentos1 = "?tipo=" + tipo.value;

    ajax1.open("GET", controller1 + argumentos1 , true);
    ajax1.send();
}

function makeRequest(tipo,b1,d1,controller1, method)
{
    let xhr = new XMLHttpRequest();

    // 2.- Crear y devolver la promesa
    return new Promise( function(resolve, reject){

        // 3.- Abrir la conexión con el método y la url indicada
        let argumentos1 = "?tipo=" + tipo.value;
        xhr.open(method, controller1 + argumentos1, true);

        // 5-A.- Escuchar el evento load que se dispara cuando la petición termina
        xhr.onload = function()
        {
            // si el estado de la respuesta es 200 (Éxito)
            if (xhr.status === 200) {
                // Resolver la promesa con la respuesta como texto
                //console.log(xhr.responseText);
                resolve(xhr.responseText);
                d1.innerHTML=this.responseText;
            }
            // Si el estado de la respuesta no es 200 (Error)
            else
            {
                // Rechazar la promesa con el estado de la respuesta como motivo
                reject(xhr.status);
            }
        };

        // 5-B.- Escuchar el evento load que se dispara cuando hay un problema con la red
        xhr.onerror = function(){
            reject('Error de red');
        };

        // 4.- Enviar la petición
        xhr.send();

    });
}




//asociacion de eventos
window.addEventListener("load", function(event){

    //Paso 1 Referencia de los objetos

    const tipo = document.getElementById("tipo");
    const b1 = document.getElementById("b1");
    const d1 = document.getElementById("d1");
    const controller1 = "AnimalController"; // Indicar solo el nombre del controlador
    const method = 'GET';

    // Paso 2 - Asociacion de del elemento al evento y llamada a la funcion
    if(b1)
    {

        b1.addEventListener("click",function(event){
            event.preventDefault();

            makeRequest(tipo,b1,d1,controller1, method);
        });
    }


});