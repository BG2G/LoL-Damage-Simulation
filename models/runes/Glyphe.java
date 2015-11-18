package lolsimulation.models.runes;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public class Glyphe extends Rune {
    public Glyphe() {
        this.couleur = "Glyphe";

    }
    public Glyphe(int stat, int bonusType, int value) {
        this.couleur = "Glyphe";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
    public String toString(){
        String details = "Glyphe";
        details = details + "; +";
        details = details + this.value + " ";
        switch(this.typeBonus){
            case FLAT:
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;

                }
                break;
            case PERC:
                details = details+"%";
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;

                }
                break;
            case SCAL:
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;

                }
                details = details+"/lvl";
                break;

        }

        return details;
    }


}
