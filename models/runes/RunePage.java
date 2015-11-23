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

	//numéro des glyphes
	public static final int G_SCAL_ENERGY = 100;
	public static final int G_ENERGY = 101;
	public static final int G_CRIT_DAMAGE = 102;
	public static final int G_SCAL_AD = 103;
	public static final int G_AD = 104;
	public static final int G_CRIT_CHANCE = 105;
	public static final int G_AS = 106;
	public static final int G_HP = 107;
	public static final int G_SCAL_MANA_REG = 108;
	public static final int G_MANA_REG = 109;
	public static final int G_SCAL_MANA = 110;
	public static final int G_MAGIC_PEN = 111;
	public static final int G_SCAL_MR = 112;
	public static final int G_MR = 113;
	public static final int G_MANA = 114;
	public static final int G_SCAL_HP = 115;
	public static final int G_HP_REG = 116;
	public static final int G_ARMOR = 117;
	public static final int G_CDR = 118;
	public static final int G_AP = 119;
	public static final int G_SCAL_AP = 120;
	public static final int G_SCAL_CDR = 121;

	//numéro des marques
	//numéro des sceaux
	//numéro des quints

	protected List<Rune> runes;

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
/*








	public static final int G_MANA_REG = 109;
	public static final int G_SCAL_MANA = 110;
	public static final int G_MAGIC_PEN = 111;
	public static final int G_SCAL_MR = 112;
	public static final int G_MR = 113;
	public static final int G_MANA = 114;
	public static final int G_SCAL_HP = 115;
	public static final int G_HP_REG = 116;
	public static final int G_ARMOR = 117;
	public static final int G_CDR = 118;
	public static final int G_AP = 119;
	public static final int G_SCAL_AP = 120;
	public static final int G_SCAL_CDR = 121;
	*/
	public Glyph createGlyph(int ref){
		Glyph g = new Glyph();

		switch(ref){
			case 100: //public static final int G_SCAL_ENERGY = 100;
				g.setStat(Rune.ENERGY);
				g.setTypeBonus(Rune.SCAL);
				g.setValue(0.161f);
				break;
			case 101: //public static final int G_ENERGY = 101;
				g.setStat(Rune.ENERGY);
				g.setTypeBonus(Rune.FLAT);
				g.setValue(2.2f);
				break;
			case 102: //public static final int G_CRIT_DAMAGE = 102;
				g.setStat(Rune.CRITRATIO);
				g.setTypeBonus(Rune.FLAT);
				g.setValue(0.56f);
				break;
			case 103: //public static final int G_SCAL_AD = 103;
				g.setStat(Rune.AD);
				g.setTypeBonus(Rune.SCAL);
				g.setValue(0.04f);
				break;
			case 104: //public static final int G_AD = 104;
				g.setStat(Rune.AD);
				g.setTypeBonus(Rune.FLAT);
				g.setValue(0.28f);
				break;
			case 105: //public static final int G_CRIT_CHANCE = 105;
				g.setStat(Rune.CRITRATIO);
				g.setTypeBonus(Rune.FLAT);
				g.setValue(0.28f);
				break;
			case 106: //public static final int G_AS = 106;
				g.setStat(Rune.AS);
				g.setTypeBonus(Rune.PERC);
				g.setValue(0.64f);
				break;
			case 107: //public static final int G_HP = 107;
				g.setStat(Rune.HP);
				g.setTypeBonus(Rune.FLAT);
				g.setValue(2.67f);
				break;
			case 108: //public static final int G_SCAL_MANA_REG = 108;
				g.setStat(Rune.MANA_REG);
				g.setTypeBonus(Rune.SCAL);
				g.setValue(0.06f);
				break;
		}


		return g;

	}
	public static int getMaxMark() {
		return MAX_MARK;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public void setRunes(List<Rune> runes) {
		this.runes = runes;
	}

	public static int getMaxQuint() {
		return MAX_QUINT;
	}

	public static int getMaxSceal() {
		return MAX_SCEAL;
	}

	public static int getMaxGlyphe() {
		return MAX_GLYPHE;
	}
}
