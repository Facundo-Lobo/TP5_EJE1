package pacientes

class Paciente {
 
 
int nro_documento
String apellido
String nombre
String sexo
Date fechaNacimiento
String telefono
String email;

static hasMany = [consultas: Consulta , practicas: Practica] // tiene 1 a mmuchas consultas

 //tiene 0 a mmuchas practicas

static contraints ={
	 nro_documento(unique: true)//default blank : false
	apellido(maxSize :100)
	nombre(maxSize :100)
	sexo(inList :['F','M'])
	
	telefono(matches: "[999-999999]+" )
	email (blank : true, email: true)
	}

}
