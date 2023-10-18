<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <title>Insertar</title>
    </head>
    <body>
        <form>
            <table class = "Tabla">
                <tr colspan = "3">
                    <td>
                        <label class="ingresos"> Nombre </label>
                        <INPUT class = "form" TYPE="text" NAME="Nombre">
                    </td>
                </tr>
                <tr colspan = "3">
                    <td>
                        <label class="ingresos"> Apellido </label>
                        <INPUT class = "form" TYPE="text" NAME="Apellido">
                    </td>
                </tr>
                <tr colspan = "3">
                    <td>
                        <label class="ingresos"> Promedio </label>
                        <INPUT class = "form" TYPE="text" NAME="Promedio">
                    </td>
                </tr>
                <tr colspan = "3">
                    <td> <input type="reset" value="Borrar"/> </td>
                    <td> <input type="submit" value="Enviar" /> </td>
                </tr>
                <tr colspan = "3">
                    <td> <a href = "index.jsp"> <button> Volver </button> </a> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
