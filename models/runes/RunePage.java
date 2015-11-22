package lolsimulation.models.runes;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class RunePage {

	//nombre max de chaque sorte de runes
	public static final int MAX_MARK = 9;
	public static final int MAX_GLYPHE = 9;
	public static final int MAX_SCEAL = 9;
	public static final int MAX_QUINT = 3;


	private List<Rune> runes;

	//constructeur
	public RunePage(){
		runes = new LinkedList<Rune>();
	}

	public String toString(){

		String runePage = "";
		String glyphs = "";
		String marks = "";
		String seals = "";
		String quints = "";
		Rune currentRune;
		String currentRuneText;


		ListIterator<Rune> listeRunes = runes.listIterator();
		while(listeRunes.hasNext()) {
			currentRune = listeRunes.next();
			currentRuneText = currentRune.toString()+"-";
			switch(currentRune.getCouleur()){
				case "Mark":
					marks += currentRuneText;
					break;
				case "Glyph":
					glyphs += currentRuneText;
					break;
				case "Seal":
					seals += currentRuneText;
					break;
				case "Quint":
					quints += currentRuneText;
					break;

			}



		}
		runePage += "Marks :"+marks+"\n";
		runePage += "Seals :"+seals+"\n";
		runePage += "Glyphs :"+glyphs+"\n";
		runePage += "Quints :"+quints+"\n";
		return runePage;
	}

	//méthode pour tenter d'ajouter une rune
	public boolean addRune(Rune newRune){
		//Check if allowed
		String couleur = newRune.getCouleur();
		int compteur = 0; //compte le nombre de runes de la même couleur déjà présentes dans la page de runes
		boolean valide = false;

		ListIterator<Rune> listeRunes = runes.listIterator();
		while(listeRunes.hasNext()){
			if(listeRunes.next().getCouleur()==couleur){
				compteur++;
			}
		}
		switch(couleur){
			case "Quint":
				if(compteur<MAX_QUINT) {
					runes.add(newRune);
					valide = true;
				}
				break;
			case "Mark":
				if(compteur<MAX_MARK) {
					runes.add(newRune);
					valide = true;
				}
				break;
			case "Glyph":
				if(compteur<MAX_GLYPHE) {
					runes.add(newRune);
					valide = true;
				}
				break;
			case "Seal":
				if(compteur<MAX_SCEAL) {
					runes.add(newRune);
					valide = true;
				}
				break;
		}
		return  valide;
	}


}
