<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Plataforma Intereses MVC</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <script src="js/motor.js"></script>
</head>
<body>
<h1 class="text-center m-3"><%= "JSP - Plataforma Intereses MVC" %>
</h1>

<div class="col-md p-1 m-1">

    <div class="p-1 m-1">
        <label>Seleccionar el tipo de animal</label>
    </div>

    <div class="btn-group p-1 m-1">
        <select class="form-select" id="tipo">
            <option value="AVE" selected>Ave</option>
            <option value="INSECTO">Insecto</option>
            <option value="MAMIFERO">Mamifero</option>
            <option value="PEZ">Pez</option>
            <option value="REPTIL">Reptil</option>
        </select>
    </div>

    <div class="p-1 m-1">
        <input class="btn btn-primary" type="button" id="b1" value="Generar">
    </div>

</div>

<div class="btn-group">
    <div id="d1" class="containter d-flex flex-wrap my-3 text-center"></div>
</div>

</body>
</html>