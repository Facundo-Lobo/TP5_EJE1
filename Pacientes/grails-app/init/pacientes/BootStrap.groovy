//revisar bien si esta todo 
package pacientes

import pacientes.Paciente
import pacientes.Practica
import pacientes.Consulta
import pacientes.TipoPractica

import grails.validation.ValidationException
class BootStrap {
	def init = { servletContext ->

def paciente1=new Paciente(email:"facundo@hotmail.com", telefono:"3832-469022" , nombre:"facundo" , fechaNacimiento: Date.parse("yyyy-MM-dd" , "2015-10-20") , nroDocumento: 55568553 , apellido: "miranda", sexo:"M") 

if (!paciente1.save(flush:true)){
	paciente1.errors.allErrors.each{
		println it
	}
}

def paciente2=new Paciente(email:"facundo@hotmail.com", telefono:"3832-469022" , nombre:"facundo2" , fechaNacimiento: Date.parse("yyyy-MM-dd" , "2015-10-20") , nroDocumento: 55568553 , apellido: "miranda2", sexo:"M") 

if (!paciente2.save(flush:true)){
	paciente1.errors.allErrors.each{
		println it
	}
}


println ("paciente1 nombre= "+paciente1.nombre);
println ("paciente2 nombre= "+paciente2.nombre);
//consulta
def consulta1=new Consulta (fecha: Date.parse("yyyy-MM-dd" , "2015-10-20") ,hora: "10-10-10" , motivo:"n" , diagnostico:"n1" , tratamiento:"n" )

if (!consulta1.save(flush:true)){
	consulta1.errors.allErrors.each{
		println it
	}
}
def consulta2=new Consulta (fecha: Date.parse("yyyy-MM-dd" , "2015-10-20") ,hora: "10-10-10" , motivo:"n" , diagnostico:"n2" , tratamiento:"n" )

if (!consulta2.save(flush:true)){
	consulta2.errors.allErrors.each{
		println it
	}
}
println ("consulta1 nombre= "+consulta1.diagnostico);
println ("consulta2 nombre= "+consulta2.diagnostico);
// Tipopractica
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

//practica
def practica1=new Practica (feachaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-15-10"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-15-11" ),resultado :"r1")

if (!practica1.save(flush:true)){
	practica1.errors.allErrors.each{
		println it
	}
}
def practica2=new Practica (feachaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-12-11"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-12-09"),resultado :"r2")

if (!practica2.save(flush:true)){
	practica2.errors.allErrors.each{
		println it
	}
}
def practica3=new Practica (feachaPrescripcion: Date.parse("yyyy-MM-dd" , "2018-15-11"),fechaRealizacion: Date.parse("yyyy-MM-dd" , "2018-15-11") ,resultado :"r3")

if (!practica3.save(flush:true)){
	practica3.errors.allErrors.each{
		println it
	}
}



    def destroy = {
 
    }
}
}