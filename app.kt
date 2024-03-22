package Biblioteca

import Biblioteca.Libro
import Biblioteca.Socio
import Biblioteca.Prestamo

class App {
	fun exec() {
		var libro1: Libro = Libro("LOTR", "J.R.R. Tolkien", 5)
		var libro2: Libro = Libro("1984", "George Orwell", 3)

		val socio1 = Socio("Clark", "Kent", 101)
		val socio2 = Socio("Bruce", "Wayne", 102)

        	val prestamo1 = Prestamo(libro1, socio1)
        	val prestamo2 = Prestamo(libro1, socio2)

        	libro1.informacion()
        	libro2.informacion()
        	socio2.informacion()
        	prestamo1.registrarPrestamo("2024-03-15")
        	libro1.informacion()
        	prestamo2.devolverPrestamo()
        	libro1.informacion()
	
	}
}
fun main() {
	App().exec()
}
