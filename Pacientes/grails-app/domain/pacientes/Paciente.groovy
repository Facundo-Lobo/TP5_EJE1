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

static constraints = {
	nroDocumento(unique: true)//default blank : false
	apellido(maxSize: 100)
	nombre(maxSize: 100)
	sexo(inList: ['F','M'])
	fechaNacimiento(max: new Date())
	telefono(matches: "[0-9]{3}[-][0-9]{6}", blank: true)
	email (blank: true, email: true)
	}

}
