import entitles.Audio;
import entitles.Image;
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
        
        System.out.println("Ciao, dimmi cosa inserire nel lettore multimediale");
        System.out.println("Digita 1 per inserire una immagine, 2 per un Audio e 3 per un Video");
        int chosen = scanner.nextInt();
        switch (chosen) {
            case 1:
                newImage().toString();
                break;
            case 2:
                newAudio();
                break;
            case 3:
                newVideo();
                break;
            default:
                System.out.println("Quindi hai scelto:  Nulla.");
                System.out.println("Non sono arrabbiato, sono solo deluso.");
                break;
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
        System.out.println("Video sia! Come la chiamiamo?");
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
        System.out.println("Audio sia! LE vogliamo dare un nome?");
        String title = scanner.nextLine();
         System.out.println("Digita un numero da  0 a 15 per impostare la Durata");
         int duration = scanner.nextInt();

         System.out.println("Digita un numero da  0 a 10 per impostare Il volume");
         int volume = scanner.nextInt();

         Audio audio1 = new Audio(title, duration, volume);
         return audio1;
    }
}
