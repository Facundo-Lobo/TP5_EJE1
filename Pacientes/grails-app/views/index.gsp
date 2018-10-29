<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
                <li><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
                <li><a href="#">App version:
                    <g:meta name="info.app.version"/></a>
                </li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Grails version:
                    <g:meta name="info.app.grailsVersion"/></a>
                </li>
                <li><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
                <li><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
                <li><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
                <li><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
                <li><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li><a href="#">${plugin.name} - ${plugin.version}</a></li>
                </g:each>
            </ul>
        </li>
    </content>
    
    <!--  Agregado  -->
    <style>
        .grails-logo-container{
            height: 330px;
        }
        .navbar-default a{
            color: black !important;
        }
        #content .colset-2-its > p {
            text-align: left;
        }
        #content .colset-2-its > h1 {
            margin-top: 0px;
            font-weight: bold;
        }
        a {
            padding-left: 2px;
            color: #000000;
            text-decoration: none;
        }
        .controller{
            margin: 10px
        }
        
    </style>
    <!--  FIN Agregado  -->


    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="FondoPrincipal2.jpg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Sanatorio</h1>

            <p>
                Un sanatorio es un centro de salud que, de acuerdo al país, puede especializarse en diferentes cuestiones. Se trata de un lugar donde los pacientes que sufren diversos trastornos y enfermedades son atendidos y pueden someterse a distintos tratamientos.
                El objetivo de un sanatorio, por lo tanto, es asistir a las personas convalecientes o enfermas para lograr su curación.
            </p>

            <div id="controllers" role="navigation">
                <h2>Controladores:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <button type="button"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></button>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
