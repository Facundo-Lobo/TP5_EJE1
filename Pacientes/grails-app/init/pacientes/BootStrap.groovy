//revisar bien si esta todo
package pacientes

import pacientes.Paciente
import pacientes.Practica
import pacientes.Consulta
import pacientes.TipoPractica

import grails.validation.ValidationException
class BootStrap {
	def init = { servletContext ->

//pacientes -------------------------------------------


def paciente1=new Paciente(email:"facundo@hotmail.com", telefono:"3832-469022" , nombre:"facundo" , fechaNacimiento: Date.parse("yyyy-MM-dd" , "2015-10-20") , nro_documento: 55568553 , apellido: "miranda", sexo:"M")

if (!paciente1.save(flush:true)){
	paciente1.errors.allErrors.each{
		println it
	}
}
 // lo esta creando
def paciente2=new Paciente(email:"facundo@hotmail.com", telefono:"3832-469022" , nombre:"facundo2" , fechaNacimiento: Date.parse("yyyy-MM-dd" , "2015-10-20") , nro_documento: 55568553 , apellido: "miranda2", sexo:"M")

if (!paciente2.save(flush:true)){
	paciente1.errors.allErrors.each{
		println it
	}
}


println ("paciente1 nombre= "+paciente1.nombre);
println ("paciente2 nombre= "+paciente2.nombre);


//consulta ---------------------------------------------

def consulta1=new Consulta (fecha: Date.parse("yyyy-MM-dd" , "2018-11-23"), hora:"20:10" , motivo:"n" , diagnostico:"n1" , tratamiento:"n" , paciente:paciente1 )

if (!consulta1.save(flush:true)){
	consulta1.errors.allErrors.each{
		println it
	}
}
def consulta2=new Consulta (fecha: Date.parse("yyyy-MM-dd" , "2018-11-23"), hora:"21:24"  , motivo:"n" , diagnostico:"n2" , tratamiento:"n" ,paciente:paciente1 )

if (!consulta2.save(flush:true)){
	consulta2.errors.allErrors.each{
		println it
	}
}
println ("consulta1 nombre= "+consulta1.diagnostico);
println ("consulta2 nombre= "+consulta2.diagnostico);


// Tipopractica ------------------------------------------------------------
def tipoPractica1=new TipoPractica (codigo:00000 ,nombre: "n2" )

if (!tipoPractica1.save(flush:true)){
	tipoPractica1.errors.allErrors.each{
		println it
	}
}
def tipoPractica2=new TipoPractica (codigo:231265 ,nombre: "n1" )

if (!tipoPractica2.save(flush:true)){
	tipoPractica2.errors.allErrors.each{
		println it
	}
}
println ("tipoPractica1 nombre= "+tipoPractica1.nombre);
println ("tipoPractica2 nombre= "+tipoPractica2.nombre);

//practica ---------------------------------------------------
def practica1=new Practica (fechaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-12-12"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-12-14" ),resultado :"r1" ,tipoPractica:tipoPractica2 , consulta:consulta1 ,paciente:paciente1)

if (!practica1.save(flush:true)){
	practica1.errors.allErrors.each{
		println it
	}
}
def practica2=new Practica (fechaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-12-11"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-12-15"),resultado :"r2" ,tipoPractica:tipoPractica2 , consulta:consulta1 ,paciente:paciente1 )

if (!practica2.save(flush:true)){
	practica2.errors.allErrors.each{
		println it
	}
}
def practica3=new Practica (fechaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-12-15"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-12-19") ,resultado :"r3" ,tipoPractica:tipoPractica1, consulta:consulta1 ,paciente:paciente1)

if (!practica3.save(flush:true)){
	practica3.errors.allErrors.each{
		println it
	}
}

println ("practica1 nombre= "+practica1.resultado);
println ("practica2 nombre= "+practica2.resultado);
println ("practica3 nombre= "+practica3.resultado);

/* NO ESTAN FUNCIONANDO LOS IF  FALTA HORA EN ATRIBUTOS
//Obtener e imprimir por consola una colección de todas las consultas dentro de un rango de fechas determinado.
if (consulta1.fecha < "2020-10-23" ){
 println ("bien");
}

if (consulta2.fecha < "2020-10-23" && consulta2.fecha > "2018-10-23" ){
 println ("fecha consulta = "+consulta1.fecha)
 println ("consulta1 nombre= "+consulta1.diagnostico);
}

//Obtener e imprimir por consola una colección todas las practicas pertenecientes al “paciente1” cuyo código de “TipoPractica” sea igual a “231265”.

if (practica1.paciente == paciente1 && practica1.tipoPractica.codigo == 231265){
	println ("bien")
}

*/

    def destroy = {

    }
}
}
