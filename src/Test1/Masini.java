package Test1;


/**
 * Dezvoltata pentru informatii <b>masina</b>
 * @author Taciuc Marian
 *
 */
public class Masini {
	int an_productie;
	String culoare;
	String marca;
	/**
	 * Constructor Masina cu informatii de baza
	 * @param an sa fie intre 2010-2021
	 * @param cul  culoare in format string
	 * @param marca  marca autorizata
	 */
	Masini(int an, String cul, String marca){
		an_productie=an;
		culoare=cul;
		this.marca=marca;
		System.out.println("S-a apelat constr. cu argumente de la Masini");
	}
	
	void Afisare(){
		System.out.println("Masina maraca: " + marca + " produsa in anul: " + an_productie + " este de culoare: " + culoare);
	}
	/**
	 * Printeaza infromatii masian in forma neautorizata
	 * @param flag 0 -- daca se printeaza normal </br>
	 * 		  flag 1 -- forma neautorizata
	 * @return true - printa reusita
	 * @throws Exception - cand nu exista toate informatiile despre masina
	 */
	boolean print(int flag)throws Exception{
		int x =100;
		
		if (flag==0){
			throw new Exception();
		}
		
		return true;
	}
	
	

}
