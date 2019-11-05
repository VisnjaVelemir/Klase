import ApstraktnaKlasa.Kablovi;

public class Glavna {

	public static void main(String[] args) {
		
		
	SvemirskiObjekat objekat = new SvemirskiObjekat ( "NGC 1290", 20000);
	
	objekat.ime = "NGC 1290";
	
	objekat.dobrodosli(objekat.ime);
	
	
	
	
	Planeta planeta = new Planeta ("Zemlja", 20000, true );
	
	planeta.voda = true;
	planeta.ime = "Zemlji";
	
	
	
	System.out.println( " Da li na planeti ima vode? Odgovor je " + planeta.voda);
	System.out.println( "Vi ste na planeti " + planeta.ime);
	
		planeta.dobrodosli (planeta.ime);
		
		
		
	
		Kablovi kablovi = new Kablovi ();
		
		kablovi.dodatak = "Konektori";
		kablovi.modelKabla = "RJ256";
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
