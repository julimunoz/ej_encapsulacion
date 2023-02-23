package ej_tema9;
import principal.*;

public class main {
	
	public static void main(String [] args)
    {
		
		Cliente cliente = new Cliente();
		
		cliente.setCredito(3000000);
		
		
		System.out.println("el credito aprobado para el cliente es: " + cliente.getCredito());
			
		
		Trabajador trabajador = new Trabajador();
		
		trabajador.setSalario(1000000);
		
		
		System.out.println("el salario del trabajador es: " + trabajador.getSalario());
		
    }
	

}

