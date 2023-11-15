package guis;

import datos.ListaDeTrabajadores;
import modelo.Trabajador;

import java.util.ArrayList;

public class VentanaMostrarDatos {

	public static void mostrarDatos() {
		ListaDeTrabajadores listaDeTrabajadores = new ListaDeTrabajadores();
		ArrayList<Trabajador> trabajadores = listaDeTrabajadores.getTrabajadores();

		System.out.println("Datos de los trabajadores:");

		for (Trabajador trabajador : trabajadores) {
			System.out.println("Nombre: " + trabajador.getNombre());
			System.out.println("Apellido: " + trabajador.getApellido());
			System.out.println("RUT: " + trabajador.getRut());
			System.out.println("Isapre: " + trabajador.getIsapre());
			System.out.println("AFP: " + trabajador.getAfp());
			System.out.println("----------------------");
		}
	}
}
