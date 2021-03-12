package Test1;

class Raspuns{
	
	Raspuns(){
		System.out.println("Mui Bien");
	}
}

public class Test {
	public static void main(String[] args) throws Exception{
		
		System.out.println("Primul test");
		System.out.println("Que tal?");
		
		Raspuns r1=new Raspuns();
		
		System.out.println("Imi pare rau ca nu am raspuns mai devreme");
		
		Masini a=new Masini(2012, "albastra", "Volvo");
		Masini b=new Masini(2021, "negru", "BMW");
		
		
		a.Afisare();
		b.print(0);
		
	}

}
