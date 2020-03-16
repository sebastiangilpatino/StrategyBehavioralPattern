import java.util.Scanner;

public class Main {

	static int bono = 50000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Cuantos Empleados desea liquidar");
		int CantEmpleados = Integer.parseInt(myObj.nextLine());
		
		Cliente empleado = new Cliente(bono);

		for(int i=0; i<CantEmpleados; i++) {
			System.out.println("Que Empleado desea liquidar:"+ "0-Gerente,"
					+ " 1-Administrativo,  " +  "2-Fabrica  "+"3-Otros");
			int TipoEmpleado = Integer.parseInt(myObj.nextLine());
			System.out.println(empleado.LiquidacionEmpleado(TipoEmpleado));
			
		}

	}

}
