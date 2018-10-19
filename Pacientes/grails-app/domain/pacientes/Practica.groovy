package pacientes

class Practica {
//	static belongsTo = [consulta: Consulta] //una pertenencia 

//	TipoPractica: tipoPractica //uno a uno 
	
	Date feachaPrescripcion
	Date fechaRealizacion
	String resultado
    static constraints = {
    	feachaPrescripcion (blank : false  )
    	fechaRealizacion (blank : false , validator: { val, obj, errors ->
    if (obj.feachaPrescripcion > val) return ['fechaRealizIncorrecta']
})
    	resultado (maxSize :500)
    }
}
