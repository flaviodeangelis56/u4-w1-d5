public class MainRiproduci {
    public static void main(String[] args) {
        Audio test1 = new Audio("test1", 2, Volume.QUATTRO);
        test1.play();
        test1.alzaVolume();
        test1.play();
        test1.abassaVolume();
        test1.play();
        test1.abassaVolume();
        test1.play();

    }
}
