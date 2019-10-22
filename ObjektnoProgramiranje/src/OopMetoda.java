
public class OopMetoda {

	public static void main(String[] args) {
		
		
Oop p = new Oop ();

Oop x = new Oop ();

p.Ime = "Pera";
x.Ime = "Zika";

p.Prezime = "Peric";
x.Prezime = "Peric";

Oop osoba = new Oop ();

osoba.Ime = "Jovan";
osoba.Prezime = "Jovanovic";
int god = osoba.Godiste = 1833;
int kila = osoba.kilaza = 100;



Oop osoba2 = new Oop();

osoba2.Ime = "Lav";
osoba2.Prezime = "Tolstoj";
int god2 = osoba2.Godiste = 1828;
int kila2 = osoba2.kilaza = 110;



if (osoba.Godiste == osoba2.Godiste) {
	System.out.println ("Isto su godiste");
	
} else {
	System.out.println ("Nisu isto godiste");
	
}

if (god == god2) {
	System.out.println ("Isto su godiste");

} else {
System.out.println ("Nisu isto godiste");

}



if (kila == kila2) {
	System.out.println ("Ista im je kilaza");
} else {
	System.out.println ("Razlicita im je kilaza");
}


/*int brojSrca = osoba.brojSrca;*/
	

osoba.Ime = "Jovan";
osoba.Prezime = "Jovanovic";

System.out.println ("Ime osobe je " + osoba.Ime + "" + osoba.Prezime );

Car car = new Car ();

car.marka = "bmw";

osoba.Automobil = car;

System.out.println ("Ova osoba vozi automobil marke " + osoba.Automobil.marka);
		
















		
		
		
		
		
		
		
		

	}
}


