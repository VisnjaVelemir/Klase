package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		Car automobil = new Car (); // instanca klase Car
		
		
		automobil.boja = "crvena";
		automobil.cena = 150000;
		automobil.kubikaza = 4.8;
		automobil.marka = "ferrari";
		automobil.model = "La ferrara";
		automobil.daljinskoZakljucavanje = true;
		
	System.out.println ("Napravio sam auto marke " + automobil.marka);
System.out.println ("Model je " + automobil.model);
System.out.println ("Boje " + automobil.boja);
System.out.println ("Koji kosta " + automobil.cena);
System.out.println ("I koji ima " + automobil.kubikaza + "L");
System.out.println ("Daljinsko zakljucavanje " + automobil.daljinskoZakljucavanje);

 Car automobil2 = new Car ();
 
 automobil2.boja = "Crna ";
 automobil2.cena = 1600000 ;
 automobil2.marka = "Mclaren ";
 automobil2.model = "Senna" ;
 
 System.out.println ("Najbrzi auto je " + automobil2.marka + " "+ automobil2.model);
 
 
 
 
 
 
 
 



	
				
	
		
		
		
		
		
		
		
		
		
		

	}

}
