<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <script src="insertar.jsp" defer></script>
        <script src="consultar.jsp" defer></script>
        <title>Instituto Tecnológico</title>
    </head>
    <body>
        <h1>Instituto Tecnológico</h1>
        <img src="internet.png" alt="internet"/>
        <table class = "Tabla">
            <tr>
                <td> <a href = "Insertar.jsp"> <button> Insertar </button> </a> </td>
                <td> <a href = "consulta.jsp"> <button> Consultar </button> </a> </td>
                <td> <form action = "muestraAlumnos" method = "post"> <button>
                            Ver registros
                    </button>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
