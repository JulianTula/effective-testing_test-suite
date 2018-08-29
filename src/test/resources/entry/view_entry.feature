#language: es
Característica: Ver entradas
	
	@wip
	Escenario: Usuario puede ver entradas del blog
		Dado la entrada "Dummy entry" con el texto "this is the text"
		Cuando el usuario ingresa a la sección de entradas
		Entonces obtiene un listado de las entradas realizadas conteniendo la entrada "Dummy entry"