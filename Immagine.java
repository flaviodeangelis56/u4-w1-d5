public class Immagine extends FileMultimediali {
    public String titolo;
    public Luminosità luminosità = Luminosità.TRE;

    public Immagine(String titolo) {
        this.titolo = titolo;

    }

    public void alzaLuminosità() {
        if (this.luminosità == Luminosità.CINQUE) {
            System.out.println("La luminosità è al massimo");
        }
        if (this.luminosità == Luminosità.QUATTRO) {
            this.luminosità = Luminosità.CINQUE;
        }
        if (this.luminosità == Luminosità.TRE) {
            this.luminosità = Luminosità.QUATTRO;
        }
        if (this.luminosità == Luminosità.DUE) {
            this.luminosità = Luminosità.TRE;
        }
        if (this.luminosità == Luminosità.UNO) {
            this.luminosità = Luminosità.DUE;
        }
    }

    public void abassaLuminosità() {
        if (this.luminosità == Luminosità.UNO) {
            System.out.println("La luminosità è al minimo");
        }
        if (this.luminosità == Luminosità.DUE) {
            this.luminosità = Luminosità.UNO;
        }
        if (this.luminosità == Luminosità.TRE) {
            this.luminosità = Luminosità.DUE;
        }
        if (this.luminosità == Luminosità.QUATTRO) {
            this.luminosità = Luminosità.TRE;
        }
        if (this.luminosità == Luminosità.CINQUE) {
            this.luminosità = Luminosità.QUATTRO;
        }
    }

    public void show() {
        if (this.luminosità == Luminosità.UNO) {
            System.out.println(this.titolo + "*");
        }
        if (this.luminosità == Luminosità.DUE) {
            System.out.println(this.titolo + "**");
        }

        if (this.luminosità == Luminosità.TRE) {
            System.out.println(this.titolo + "***");
        }
        if (this.luminosità == Luminosità.QUATTRO) {
            System.out.println(this.titolo + "****");
        }
        if (this.luminosità == Luminosità.CINQUE) {
            System.out.println(this.titolo + "*****");
        }
    }
}

