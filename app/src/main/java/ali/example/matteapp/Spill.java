package ali.example.matteapp;

public class Spill {
    private String innVerdi;
    private String riktigSvar;
    public String[] quizarray;
    public String sprsmol;
    public int antallSp;


    int riktigTeller = 0;
    int galeTeller = 0;


    public String getInnVerdi() {
        return innVerdi;
    }

    public void setInnVerdi(String innVerdi) {
        this.innVerdi = innVerdi;
    }

    public void SettArray(String[] quizarray) {
        this.quizarray = quizarray;
    }

    public boolean sjekkSvar(String innVerdi, String riktigSvar) {
        this.innVerdi = innVerdi;
        this.riktigSvar = riktigSvar;
        int riktigSv = Integer.parseInt(this.riktigSvar);
        int Innverdi = Integer.parseInt(this.innVerdi);
        if (Innverdi == riktigSv) {
            riktigTeller++;
            return true;
        } else {
            galeTeller++;
            return false;
        }

    }

    public String Sporsmål(int i) {

        sprsmol = quizarray[i];
        antallSp++;

        return sprsmol;
    }


}
