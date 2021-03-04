package myFirstMethod;

public class ProvaLlibre {
	public static void main(String []args) {
		Llibre[] llibres = new Llibre[3];
		
		Llibre llib1 = new Llibre("123ADSH123Aa", "Thus Muerth Os 1", "Thuma DreeE", 300);
		Llibre llib2 = new Llibre("123ADSH123", "Thus Muerth Os 2", "Thuma Dreea", 200);
		Llibre llib3 = new Llibre("123asdfwer1234", "Thus Muerth Os 3", "Thuma Dree", 350);
		
		
		System.out.println(llib1.toString());
		System.out.println(llib2.toString());
		System.out.println(llib3.toString());
		
		llibres[0] = llib1;
		llibres[1] = llib2;
		llibres[2] = llib3;
		
		Llibre llib4 = new Llibre();
		llib4 = llib4.greatestLlibre(llibres);
		System.out.println("El llibre més gran és: " + llib4.getTitle() + " amb " + llib4.getPage() + " pàgines.");
   	}
}