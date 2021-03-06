package Test1;

class Raspuns{
	
	Raspuns(){
		System.out.println("Mui Bien");
	}
}

public class Test {
	public static void main(String[] args){
		
		System.out.println("Primul test");
		System.out.println("Que tal?");
		
		Raspuns r1=new Raspuns();
		Masini a=new Masini(2012, "albastra", "Volvo");
		a.Afisare();
		
	}

}
