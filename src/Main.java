import entitles.Audio;
import entitles.Image;
import entitles.MultimediaElement;
import entitles.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
   /*     Audio audio1 = new Audio("Come Mai", 3, 5);
        System.out.println(        audio1.toString());
        audio1.play();
        Video video1 = new Video("Avventura Spaziale", 10,2,5 );
        System.out.println(video1.toString());
       video1.play();*/
        /*Image image1 = new Image("Immagina, puoi", 3);
        image1.show();*/
        Scanner scanner = new Scanner(System.in);
        MultimediaElement[] playlist = new MultimediaElement[5];
        System.out.println("Ciao, dimmi cosa inserire nel lettore multimediale");
        System.out.println("Inseriremo 5 elementi.");
        ;
        for (int i = 0; i <= playlist.length-1; i++){
            System.out.println("Posizione "+( i+1) + " della playlist:");
            System.out.println("Digita 1 per inserire una Immagine, 2 per un Audio e 3 per un Video");
            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1:
                    playlist[i] = newImage();
                    System.out.println("Immagine inserita correttamente!");

                    break;
                case 2:
                    playlist[i] = newAudio();
                    System.out.println("Audio inserito correttamente!");
                    break;
                case 3:
                    playlist[i] = newVideo();
                    System.out.println("Video inserito correttamente");
                    break;
                default:
                    System.out.println("Quindi hai scelto:  Nulla.");
                    System.out.println("Non sono arrabbiato, sono solo deluso.");
                    System.exit(0);
            }
        }

            System.out.println("La tua playlist è pronta! Essa contiene:");
        for(int i =0; i<= playlist.length -1; i++){
            System.out.println( (i+1) +")" + playlist[i].getTitle());
        }

         int chosen = -1   ;
        while (chosen !=0){
            System.out.println("Cosa vuoi riprodurre? digita un numero da 1 a 5. premi 0 per interrompere tutto.");
            chosen = scanner.nextInt();
            switch (chosen) {
                case 1:
                    if (playlist[0] instanceof Image) {
                        Image currentImage = (Image) playlist[0];

                        currentImage.show();
                    } else if (playlist[0] instanceof Video) {
                        Video currentVideo = (Video) playlist[0];
                        currentVideo.play();
                    } else {
                        Audio currentAudio = (Audio) playlist[0];
                        currentAudio.play();
                    }


                    break;
                case 2:
                    if (playlist[1] instanceof Image) {
                        Image currentImage = (Image) playlist[1];
                        currentImage.show();

                    } else if (playlist[1] instanceof Video) {
                        Video currentVideo = (Video) playlist[1];
                        currentVideo.play();
                    } else {
                        Audio currentAudio = (Audio) playlist[1];
                        currentAudio.play();
                    }

                    break;
                case 3:
                    if (playlist[2] instanceof Image) {
                        Image currentImage = (Image) playlist[2];
                        currentImage.show();

                    } else if (playlist[2] instanceof Video) {
                        Video currentVideo = (Video) playlist[2];
                        currentVideo.play();
                    } else {
                        Audio currentAudio = (Audio) playlist[2];
                        currentAudio.play();
                    }


                    break;
                case 4:
                    if (playlist[3] instanceof Image) {
                        Image currentImage = (Image) playlist[3];
                        currentImage.show();


                    } else if (playlist[3] instanceof Video) {
                        Video currentVideo = (Video) playlist[3];
                        currentVideo.play();
                    } else {
                        Audio currentAudio = (Audio) playlist[3];
                        currentAudio.play();
                    }


                    break;
                case 5:
                    if (playlist[4] instanceof Image) {
                        Image currentImage = (Image) playlist[4];
                        currentImage.show();

                    } else if (playlist[4] instanceof Video) {
                        Video currentVideo = (Video) playlist[4];
                        currentVideo.play();
                    } else {
                        Audio currentAudio = (Audio) playlist[4];
                        currentAudio.play();
                    }


                    break;
                case 0:
                    System.out.println("Addio! E' stato un piacere");

                    System.exit(0);
                default:
                    System.out.println("Scelta non valida");


            }

        }



    }
    public static Image newImage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Immagine sia! Come la battezziamo?");
        String title = scanner.nextLine();
        System.out.println("Digita un numero da  0 a 5 per impostare la luminosità");
        int brightness = scanner.nextInt();

         Image image = new Image(title, brightness);
         return image;

    }    public static Video newVideo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Video sia! Come lo chiamiamo?");
        String title = scanner.nextLine();
        System.out.println("Digita un numero da  0 a 15 per impostare la Durata");
        int duration = scanner.nextInt();
        System.out.println("Digita un numero da  0 a 5 per impostare la Luminosità");
        int brightness = scanner.nextInt();
        System.out.println("Digita un numero da  0 a 10 per impostare Il volume");
        int volume = scanner.nextInt();

        Video video1 = new Video(title, duration,volume,brightness );

         return video1;
    }

     public static Audio newAudio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Audio sia! Gli vogliamo dare un nome?");
        String title = scanner.nextLine();
         System.out.println("Digita un numero da  0 a 15 per impostare la Durata");
         int duration = scanner.nextInt();

         System.out.println("Digita un numero da  0 a 10 per impostare Il volume");
         int volume = scanner.nextInt();

         Audio audio1 = new Audio(title, duration, volume);
         return audio1;
    }
}
