import java.util.Scanner;

public class MainRiproduci {
    public static void main(String[] args) {
        FileMultimediali[] fileArry = new FileMultimediali[5];


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < fileArry.length; i++) {
            System.out.println("Inserisci audio per creare un audio, video per creare un video,immagine per creare un immagine");
            String inputCreazione = input.nextLine();
            if (inputCreazione.equals("audio")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                System.out.println("Inserisci la durata e premi invio");
                int inputDurata = Integer.parseInt(input.nextLine());
                Audio audio = new Audio(inputTitolo, inputDurata);
                fileArry[i] = audio;
            }
            if (inputCreazione.equals("video")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                System.out.println("Inserisci la durata e premi invio");
                int inputDurata = Integer.parseInt(input.nextLine());
                Video video = new Video(inputTitolo, inputDurata);
                video.play();
                fileArry[i] = video;
            }
            if (inputCreazione.equals("immagine")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                Immagine immagine = new Immagine(inputTitolo);
                immagine.show();
                fileArry[i] = immagine;
            }
        }
        // for (int i = 0; i < fileArry.length; i++) {
//System.out.println("Inserisci 0 per vedere il primo file creato 1 per il secondo 2 per il terzo 3 per il quarto 4 per il quinto");
        //  int mostraFile = Integer.parseInt(input.nextLine());
        //  if (fileArry[mostraFile] instanceof Audio) {
        //   ((Audio) fileArry[mostraFile]).play();
        //  }
        // if (fileArry[mostraFile] instanceof Video) {
        //   ((Video) fileArry[mostraFile]).play();
        // }
        //if (fileArry[mostraFile] instanceof Immagine) {
        //    ((Immagine) fileArry[mostraFile]).show();
        //  }
        // }


        input.close();

    }
}
