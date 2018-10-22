package pacientes

class Practica {
//	static belongsTo = [consulta: Consulta] //una pertenencia 

	
	
	Date feachaPrescripcion
	Date fechaRealizacion
	String resultado
    
    //TipoPractica: tipoPractica //uno a uno 

    //static belongsTo = [paciente: Paciente] //tiene 1 paciente


    static belongsTo = [consulta: Consulta , tipoPractica: TipoPractica , paciente: Paciente] // solo tiene 1 consulta

    static constraints = {
    	feachaPrescripcion (blank : false  )
    	fechaRealizacion (blank : false , validator: { val, obj, errors ->
    if (obj.feachaPrescripcion > val) return ['fechaRealizIncorrecta']
})
    	resultado (maxSize :500)
    }
}
