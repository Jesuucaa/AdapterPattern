package mx.uv.frontend;

import java.util.Scanner;

import mx.uv.backend.Motor;
import mx.uv.backend.MotorComun;
import mx.uv.backend.MotorEconomico;
import mx.uv.backend.MotorElectricoAdapter;

public class Aplicacion {
	
	private static Scanner sc = new Scanner(System.in);
	private static Motor motor;

	public static void main(String[] args) {
		
		int opcion;
		
		do
		{
			opcion = preguntarOpcion();
			
			switch(opcion)
			{
				case 1:
					motor = new MotorComun();
					usarMotor();
					break;
				case 2:
					motor = new MotorEconomico();
					usarMotor();
					break;
				case 3:
					motor = new MotorElectricoAdapter();
					usarMotor();
					break;
				case 4:
					System.out.println("¡Cerrando Programa!");
					break;
				default:
					System.out.println("La opción ingresada no es válida");
			}

		}while(opcion != 4);

	}
	
	public static int preguntarOpcion()
	{
		int opcion;
		
		System.out.print(
				"MENÚ DE OPCIONES\n"
				+"--- -- --------\n"
				+"1. Encender motor común.\n"
				+"2. Encender motor económico.\n"
				+"3. Encender motor eléctrico.\n"
				+"4. Salir\n"
				+"Selecccione la opción: "
		);
		opcion = sc.nextInt();
		return opcion;
	}
	
	private static void usarMotor()
	{
		motor.encender();
		motor.acelerar();
		motor.apagar();
		System.out.println();
	}

}
