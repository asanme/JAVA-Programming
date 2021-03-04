package myFirstMethod;

public class Curs {
	private String nomCurs;
	private String nomProfessor;
	
	
	public Curs() {
		this.nomCurs = "";
		this.nomProfessor = "";
	}
	
	public Curs(String nomCurs, String nomProfessor) {
		this.nomCurs = nomCurs;
		this.nomProfessor = nomProfessor;
	}
	
	/** 			SETTERS 			**/
	public void setNomCurs(String nomCurs) {
		this.nomCurs = nomCurs;
	}
	
	public void setNomProfessor(String nomProfessor) {
		this.nomProfessor = nomProfessor;
	}
	
	/**				GETTERS				**/
	public String getNomCurs() {
		return nomCurs;
	}
	
	public String getNomProfessor() {
		return nomProfessor;
	}
	
	public String formatCadena() {
		String result = nomCurs + " impartit per " + nomProfessor;
		return result;
	}
}
