package pacientes

class TipoPractica {


	//Practica: practica //uno a uno 
	int codigo
	String nombre 

    static constraints = {
    	codigo (blank : false)
    	nombre (blank : false) 

    }
}
