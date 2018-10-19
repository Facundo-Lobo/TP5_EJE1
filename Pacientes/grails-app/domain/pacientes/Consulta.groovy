package pacientes

class Consulta {

// 
// static hasMany = [practicas: Practica] 
Date fecha
String hora 
String motivo 
String diagnostico
String tratamiento

   static belongsTo = [paciente: Paciente] //bidireccional

    static constraints = {
    	fecha (blank : false ,max: new Date())
    	hora(blank : true, matches: "[99-99-99]+")
    	motivo (blank : false ,maxSize :500)
    	diagnostico (blank : false ,maxSize :500)
    	tratamiento (blank : false ,maxSize :500)
    }	
}
