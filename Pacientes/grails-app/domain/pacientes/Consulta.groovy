package pacientes

class Consulta {

// 
// static hasMany = [practicas: Practica] 
Date fecha
String hora 
String motivo 
String diagnostico
String tratamiento;

   static belongsTo = [paciente: Paciente] //teine 1 paciente


   static hasMany = [practicas: Practica]  // teine o a muchas practicas 

    static constraints = {
    	fecha (blank: false, min: new Date())
    	hora(blank: true, matches: "[0-2]{1}[0-9]{1}[:][0-5]{1}[0-9]{1}")
    	motivo (blank: false ,maxSize :500)
    	diagnostico (blank: false ,maxSize :500)
    	tratamiento (blank: false ,maxSize :500)
    }	
}
