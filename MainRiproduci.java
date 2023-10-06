import java.util.Scanner;

public class MainRiproduci {
    public static void main(String[] args) {
        FileMultimediali[] fileArry = new FileMultimediali[5];


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < fileArry.length; i++) {
            System.out.println("Inserisci audio per creare un audio, video per creare un video,immagine per creare un immagine");
            String inputCreazione = input.nextLine();
            if (inputCreazione.toLowerCase().trim().equals("audio")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                System.out.println("Inserisci la durata e premi invio");
                int inputDurata = Integer.parseInt(input.nextLine());
                Audio audio = new Audio(inputTitolo, inputDurata);
                fileArry[i] = audio;
            } else if (inputCreazione.toLowerCase().trim().equals("video")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                System.out.println("Inserisci la durata e premi invio");
                int inputDurata = Integer.parseInt(input.nextLine());
                Video video = new Video(inputTitolo, inputDurata);
                fileArry[i] = video;
            } else if (inputCreazione.toLowerCase().trim().equals("immagine")) {
                System.out.println("Inserisci un titolo e premi invio");
                String inputTitolo = input.nextLine();
                Immagine immagine = new Immagine(inputTitolo);
                fileArry[i] = immagine;
            } else {
                System.out.println("Errore tipo di file non esistente, ricomicia a creare i file");
                i = -1;
            }
        }

        while (true) {
            System.out.println("Inserisci 1 per vedere il primo file creato 2 per il secondo 3 per il terzo 4 per il quarto 5 per il quinto, iserisci 0 per terminare il programma");
            int mostraFile = Integer.parseInt(input.nextLine());

            if (mostraFile == 0) {
                break;
            }

            if (mostraFile == 1) {
                if (fileArry[0] instanceof Audio) {
                    ((Audio) fileArry[0]).play();
                }
                if (fileArry[0] instanceof Video) {
                    ((Video) fileArry[0]).play();
                }
                if (fileArry[0] instanceof Immagine) {
                    ((Immagine) fileArry[0]).show();
                }
            }
            if (mostraFile == 2) {
                if (fileArry[1] instanceof Audio) {
                    ((Audio) fileArry[1]).play();
                }
                if (fileArry[1] instanceof Video) {
                    ((Video) fileArry[1]).play();
                }
                if (fileArry[1] instanceof Immagine) {
                    ((Immagine) fileArry[1]).show();
                }
            }
            if (mostraFile == 3) {
                if (fileArry[2] instanceof Audio) {
                    ((Audio) fileArry[2]).play();
                }
                if (fileArry[2] instanceof Video) {
                    ((Video) fileArry[2]).play();
                }
                if (fileArry[2] instanceof Immagine) {
                    ((Immagine) fileArry[2]).show();
                }
            }
            if (mostraFile == 4) {
                if (fileArry[3] instanceof Audio) {
                    ((Audio) fileArry[3]).play();
                }
                if (fileArry[3] instanceof Video) {
                    ((Video) fileArry[3]).play();
                }
                if (fileArry[3] instanceof Immagine) {
                    ((Immagine) fileArry[3]).show();
                }
            }
            if (mostraFile == 5) {
                if (fileArry[4] instanceof Audio) {
                    ((Audio) fileArry[4]).play();
                }
                if (fileArry[4] instanceof Video) {
                    ((Video) fileArry[4]).play();
                }
                if (fileArry[4] instanceof Immagine) {
                    ((Immagine) fileArry[4]).show();
                }
            }

        }

        input.close();

    }
}
