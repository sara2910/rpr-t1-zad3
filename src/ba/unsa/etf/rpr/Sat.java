package ba.unsa.etf.rpr;



public class Sat {
    private int sati,minute,sekunde;
    public Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
    public void Postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
    public void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    public void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    public void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
    }
    int getSate() { return sati; }
    int getMinute() { return minute; }
    int getSekunde() { return sekunde; }
    void Ispisi() { System.out.println(this.getSate()+":"+this.getMinute()+":"+this.getSekunde()); }


    public static void main(String[] args) {
        Sat s= new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }}