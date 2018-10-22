package pacientes

class TipoPractica {


	
	int codigo
	String nombre ; 
	
	//static belongsTo = [practica: Practica] //uno a uno 
    
    static constraints = {
    	codigo (minSize: 6, maxSize: 6, blank: false, unique: true)
    	nombre (blank : false, maxSize: 100) 
    }
}
