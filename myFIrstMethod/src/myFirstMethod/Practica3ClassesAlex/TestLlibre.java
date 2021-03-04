package myFirstMethod.Practica3ClassesAlex;

import java.time.LocalDate;

public class TestLlibre {
	public static void main(String [] args) {
		Llibre llibre1 = new Llibre("Alex", 5f, 19.90f, "Test", 100);
		LlibreDigital llibreD1 = new LlibreDigital("Alex", 5f, 19.90f, "Test", 100,"torrent.com", 1000);
		System.out.println("L'IVA del llibre és de " + llibre1.obtenirIva());
		System.out.println("EL benefici del llibre és de " + llibre1.obtenirBenefici());
		System.out.println("El tamany de la pàgina és: " + llibreD1.tamanyPag() + " MB");
		llibre1.titolToString();
		System.out.println(LocalDate.now());
	}
}
