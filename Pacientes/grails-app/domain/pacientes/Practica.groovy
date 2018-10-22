package pacientes

class Practica {
//	static belongsTo = [consulta: Consulta] //una pertenencia 

	
	
	Date fechaPrescripcion
	Date fechaRealizacion
	String resultado
    
    //TipoPractica: tipoPractica //uno a uno 

    //static belongsTo = [paciente: Paciente] //tiene 1 paciente


    static belongsTo = [consulta: Consulta , tipoPractica: TipoPractica , paciente: Paciente] // solo tiene 1 consulta

    static constraints = {
    	fechaPrescripcion (blank: false, max: new Date())
    	fechaRealizacion (blank: false , validator: { val, obj ->
            if (obj.fechaPrescripcion > val) return ['fechaRealizacionIncorrecta']
        })
    	resultado (maxSize :500)
    }
}
