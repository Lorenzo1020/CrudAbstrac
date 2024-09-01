package Principal;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import model.LicInformatica;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		String matricula;
		String nombre;
		long cedula;
		String equipoComp;
		String tecgDesar;

		LicInformatica informatica = null;

		Scanner lectura = null;

		int menuPrinc, menuInfor, subMenu, indice;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---CRUD DE INFORMTICA");
			System.out.println("2---SALIR");
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				do {
					System.out.println("MENU DE INFORMATICA");
					System.out.println("1----ALTA");
					System.out.println("2----MOSTRAR");
					System.out.println("3----BUSCAR");
					System.out.println("4---EDITAR");
					System.out.println("5---ELIMINAR");
					System.out.println("6---REGRESAR M.P");
					lectura = new Scanner(System.in);
					menuInfor = lectura.nextInt();

					switch (menuInfor) {
					case 1:
						System.out.println("Ingrese la matricula");
						lectura = new Scanner(System.in);
						matricula = lectura.nextLine();

						System.out.println("Ingrese el nombre de la profesion");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						System.out.println("Ingrese la cedula");
						lectura = new Scanner(System.in);
						cedula = lectura.nextLong();

						System.out.println("Ingrese el equipo de computo");
						lectura = new Scanner(System.in);
						equipoComp = lectura.nextLine();

						System.out.println("Ingrese las tecnologias");
						lectura = new Scanner(System.in);
						tecgDesar = lectura.nextLine();

						// Crea el objeto
						informatica = new LicInformatica(matricula, nombre, cedula, equipoComp, tecgDesar);

						// guardar
						imp.guardar(informatica);
						System.out.println("Se guardo");

						break;
					case 2:
						System.out.println(imp.mostrar());
						break;
					case 3:
						imp.indiceNombre();

						System.out.println("\nIngrese el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						informatica = imp.buscar(indice);
						System.out.println("Se encontro el registro " + informatica);
						break;
					case 4:
						imp.indiceNombre();

						System.out.println("\nIngrese el indice a editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						informatica = imp.buscar(indice);
						System.out.println("Se encontro el registro " + informatica.getNombre());

						break;
					case 5:
						imp.indiceNombre();

						System.out.println("Imgrese el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Eliminar
						imp.eliminar(indice);
						System.out.println("Se elimino");
						break;
					case 6:
						break;
					}

				} while (menuInfor < 6);
				break;
			case 2:
				break;
			}

		} while (menuPrinc < 2);

	}

}
