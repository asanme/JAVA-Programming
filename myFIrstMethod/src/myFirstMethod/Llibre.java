package myFirstMethod;

public class Llibre {
	private String isbn;
	private String title;
	private String author;
	private int pageNumber;
	
	public Llibre() {
		this.author = "";
		this.isbn = "";
		this.pageNumber = 0;
		this.title = "";
	}
	
	public Llibre(String isbn, String title, String author, int pageNumber) {
		this.author = author;
		this.isbn = isbn;
		this.pageNumber = pageNumber;
		this.title = title;
		
	}
	// 				GETTERS 			// 
	public String getISBN() {
		return this.isbn;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPage() {
		return this.pageNumber;
	}
	
	public String toString() {
		String frase = "El llibre de títol " + this.title + " té el ISBN " + this.isbn + " té com a autor " + this.author + " i té " + this.pageNumber + " pàgines" ;
		return frase;
	}
	
	// 				SETTERS 			// 

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPageNumber(int pageNumber) {
		if(pageNumber < 0) {
			System.out.println("No pot ser un nombre negatiu!");
		} else {
			this.pageNumber = pageNumber;	
		}
	}
	
	
	// 				MÈTODES 			// 
	
	public Llibre greatestLlibre(Llibre[] llibre) {
		int count;
		int greatestBook;
		Llibre result = null;
		
		if(llibre.length > 0) {
			result = new Llibre();
			greatestBook = llibre[0].getPage();
			count = 0;
			for(int i = 0; i < llibre.length; i++) {
				if(llibre[i].getPage() > greatestBook) {
					greatestBook = llibre[i].getPage();
					count = i;
				}
			}
			
			result = llibre[count];
		}
		return result;
	}
	
}
