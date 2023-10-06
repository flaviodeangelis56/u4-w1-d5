public class Video {
    public String titolo;
    public int durata;
    public Volume volume;
    public Luminosità luminosità;

    public Video(String titolo, int durata, Volume volume, Luminosità luminosità) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
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

    public void play() {

        if (this.volume == Volume.UNO) {
            if (this.luminosità == Luminosità.UNO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!" + "*");
                }
            }
            if (this.luminosità == Luminosità.DUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!" + "**");
                }
            }
            if (this.luminosità == Luminosità.TRE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!" + "***");
                }
            }
            if (this.luminosità == Luminosità.QUATTRO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!" + "****");
                }
            }
            if (this.luminosità == Luminosità.CINQUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!" + "*****");
                }
            }
        }
        if (this.volume == Volume.DUE) {
            if (this.luminosità == Luminosità.UNO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!" + "*");
                }
            }
            if (this.luminosità == Luminosità.DUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!" + "**");
                }
            }
            if (this.luminosità == Luminosità.TRE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!" + "***");
                }
            }
            if (this.luminosità == Luminosità.QUATTRO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!" + "****");
                }
            }
            if (this.luminosità == Luminosità.CINQUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!" + "*****");
                }
            }
        }
        if (this.volume == Volume.TRE) {
            if (this.luminosità == Luminosità.UNO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!" + "*");
                }
            }
            if (this.luminosità == Luminosità.DUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!" + "**");
                }
            }
            if (this.luminosità == Luminosità.TRE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!" + "***");
                }
            }
            if (this.luminosità == Luminosità.QUATTRO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!" + "****");
                }
            }
            if (this.luminosità == Luminosità.CINQUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!" + "*****");
                }
            }
        }
        if (this.volume == Volume.QUATTRO) {
            if (this.luminosità == Luminosità.UNO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!" + "*");
                }
            }
            if (this.luminosità == Luminosità.DUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!" + "**");
                }
            }
            if (this.luminosità == Luminosità.TRE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!" + "***");
                }
            }
            if (this.luminosità == Luminosità.QUATTRO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!" + "****");
                }
            }
            if (this.luminosità == Luminosità.CINQUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!" + "*****");
                }
            }
        }
        if (this.volume == Volume.CINQUE) {
            if (this.luminosità == Luminosità.UNO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!!" + "*");
                }
            }
            if (this.luminosità == Luminosità.DUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!!" + "**");
                }
            }
            if (this.luminosità == Luminosità.TRE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!!" + "***");
                }
            }
            if (this.luminosità == Luminosità.QUATTRO) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!!" + "****");
                }
            }
            if (this.luminosità == Luminosità.CINQUE) {
                for (int i = 0; i < this.durata; i++) {
                    System.out.println(this.titolo + "!!!!!" + "*****");
                }
            }
        }
    }
}
