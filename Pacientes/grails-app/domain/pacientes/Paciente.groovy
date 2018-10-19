package pacientes

class Paciente {
 
//static hasMany = [practicas: Practica] 
int nroDocumento
String apellido
String nombre
String sexo
Date fechaNacimiento
String telefono
String email

static hasMany = [consultas: Consulta]

static contraints ={
	nroDocumento (unique: true) //default blank : false
	apellido (maxSize :100)
	nombre (maxSize :100)
	sexo (inList :['F','M'])
	fechaNacimiento ()
	telefono(matches: "[999-999999]+" )
	email (blank : true, email: true)
	}

}
