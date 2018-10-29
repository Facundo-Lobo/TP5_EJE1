<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <!--Agregado-->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
  <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
  <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
<!--FIN Agregado-->



    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="Graphicloads-Polygon-Hospital.ico" type="image/x-ico" />

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>

    <!--Agregado-->
    <style>
        a{
            padding-left: 2px;
            color: #000000;
            text-decoration: none;
        }
        .navbar-default a{
            color: black !important;
        }

        #logo{
          padding-right: 20px;
        }

        li{
            padding-right: 20px;
        }

        .footer {
            font-size: 15px;
            font-weight: bold;
        }

        .navbar-nav{
            list-style:none;
        }

    </style>
    <!--FIN Agregado-->



</head>
<body>

    <!--<div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/#">
		    <asset:image src="grails.svg" alt="Grails Logo"/>
                </a>
            </div>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                    <g:pageProperty name="page.nav" />
                </ul>
            </div>
        </div>
    </div>-->

    <!--Agregado-->
    <div class="navbar navbar-default navbar-inverse" role="navigation" >
        <div class="container">
            <div class="navbar-header">
              <a class="navbar-brand" href="/#" style="padding-right:150px">
                      <asset:image src="Graphicloads-Polygon-Hospital.ico" alt="Logo" id="Logo" title="Inicio"/>
                </a>
            </div>

            <div class="collapse navbar-collapse " id="navbarCollapse">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item" ><button type="button" class="btn btn-inverse navbar-btn"><a href="http://localhost:8080/paciente/index">Paciente </a></button></li>
                <li class="nav-item"><button type="button" class="btn btn-inverse navbar-btn"><a href="http://localhost:8080/paciente/index"><a href="http://localhost:8080/consulta/index">Consulta </a></button></li>
                <li class="nav-item"><button type="button" class="btn btn-inverse navbar-btn"><a href="http://localhost:8080/practica/index">Práctica </a></button></li>
                <li class="nav-item"><button type="button" class="btn btn-inverse navbar-btn"><a href="http://localhost:8080/tipoPractica/index">Tipo Práctica </a></button></li>
              </ul>


            </div>

        </div>
    </div>
    <!--FIN Agregado-->







    <g:layoutBody/>

    <div class="footer" role="contentinfo">Sanatorio &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Dirección &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Teléfono &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Horarios de Atención &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
