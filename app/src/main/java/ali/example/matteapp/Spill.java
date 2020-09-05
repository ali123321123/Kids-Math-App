package ali.example.matteapp;

public class Spill {
 private  String innVerdi ;
 private  String riktigSvar ;
    int riktigTeller=0;
    int galeTeller=0;

    public String getInnVerdi() {
        return innVerdi;
    }

    public void setInnVerdi(String innVerdi) {
        this.innVerdi = innVerdi;
    }
    public boolean sjekkSvar(String innVerdi,String riktigSvar){
        this.innVerdi = innVerdi;
        this.riktigSvar=riktigSvar;
        int riktigSv =Integer.parseInt(this.riktigSvar);
        int Innverdi =Integer.parseInt(this.innVerdi);
        if(Innverdi==riktigSv){
            riktigTeller++;
            return true ;
        }
        else{
            galeTeller++;
            return false;
        }
    }
}
