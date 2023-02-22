package principal;

public class main {
	
	public static void main(String [] args)
    {
		
		Persona persona = new Persona ();
		
		persona.setEdad(23);
		persona.setNombre("julian");
		persona.setTelefono(2345678);
		
		System.out.println("la edad de la persona es: " + persona.getEdad());
		System.out.println("el nombre de la persona es: " + persona.getNombre());
		System.out.println("el telefono de la persona es: " + persona.getTelefono());
    }

}
