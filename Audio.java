public class Audio {
    public String titolo;
    public int durata;
    public Volume volume;

    public Audio(String titolo, int durata, Volume volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        if (this.volume == Volume.CINQUE) {
            System.out.println("Il volume è al massimo");
        }
        if (this.volume == Volume.QUATTRO) {
            this.volume = Volume.CINQUE;
        }
        if (this.volume == Volume.TRE) {
            this.volume = Volume.QUATTRO;
        }
        if (this.volume == Volume.DUE) {
            this.volume = Volume.TRE;
        }
        if (this.volume == Volume.UNO) {
            this.volume = Volume.DUE;
        }
    }

    public void abassaVolume() {
        if (this.volume == Volume.UNO) {
            System.out.println("Il volume è al minimo");
        }
        if (this.volume == Volume.DUE) {
            this.volume = Volume.UNO;
        }
        if (this.volume == Volume.TRE) {
            this.volume = Volume.DUE;
        }
        if (this.volume == Volume.QUATTRO) {
            this.volume = Volume.TRE;
        }
        if (this.volume == Volume.CINQUE) {
            this.volume = Volume.QUATTRO;
        }
    }

    public void play() {

        if (this.volume == Volume.UNO) {
            for (int i = 0; i < this.durata; i++) {
                System.out.println(this.titolo + "!");
            }
        }
        if (this.volume == Volume.DUE) {
            for (int i = 0; i < this.durata; i++) {
                System.out.println(this.titolo + "!!");
            }
        }
        if (this.volume == Volume.TRE) {
            for (int i = 0; i < this.durata; i++) {
                System.out.println(this.titolo + "!!!");
            }
        }
        if (this.volume == Volume.QUATTRO) {
            for (int i = 0; i < this.durata; i++) {
                System.out.println(this.titolo + "!!!!");
            }
        }
        if (this.volume == Volume.CINQUE) {
            for (int i = 0; i < this.durata; i++) {
                System.out.println(this.titolo + "!!!!!");
            }
        }
    }
}



