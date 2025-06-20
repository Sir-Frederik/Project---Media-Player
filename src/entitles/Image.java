package entitles;

import interfaces.Visionable;

public class Image extends MultimediaElement implements Visionable {
    private int brightness;
    public Image (String title,  int brightness) {
        super(title);

          if (brightness <= maxBrightness && brightness >= minBrightness) {
            this.brightness = brightness;
        };


    }

    @Override
    public void reduceBrightness() {

    }

    @Override
    public void increaseBrightness() {

    }

    @Override
    public void show(){
        System.out.println("Ecco l'immagine  dal titolo: " +title);
        System.out.print(title + " ");
        for(int i =0; i < brightness; i++) {
            System.out.print("*");

    }
        System.out.println();
        System.out.println("Bellissima, vero? Estasiante, oserei dire");
}}
