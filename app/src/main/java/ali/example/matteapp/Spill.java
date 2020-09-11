package ali.example.matteapp;

public class Spill {
    private String innVerdi;
    private String riktigSvar;
    public String[] quizarray;
    public int antallSp;
    int riktigTeller ;
    int galeTeller ;

public Spill(){

    this.riktigTeller = 0;
    this.galeTeller = 0;
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



}
