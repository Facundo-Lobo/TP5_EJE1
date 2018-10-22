package pacientes

class TipoPractica {


	
	int codigo
	String nombre ; 
	
	//static belongsTo = [practica: Practica] //uno a uno 
    
    static constraints = {
    	codigo (blank : false)
    	nombre (blank : false) 

    }
}
