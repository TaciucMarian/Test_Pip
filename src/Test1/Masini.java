package Test1;

public class Masini {
	int an_productie;
	String culoare;
	String marca;
	
	Masini(int an, String cul, String marca){
		an_productie=an;
		culoare=cul;
		this.marca=marca;
		System.out.println("S-a apelat constr. cu argumente de la Masini");
	}
	
	void Afisare(){
		System.out.println("Masina maraca: " + marca + " produsa in anul: " + an_productie + " este de culoare: " + culoare);
	}
	
	

}
