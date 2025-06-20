package entitles;

import interfaces.Riproducible;
import interfaces.Visionable;

public class Video extends MultimediaElement implements Riproducible, Visionable {

    private int duration;
    private int volume;
    private int brightness;

    public Video (String title, int duration, int volume, int brightness) {
        super(title);
        if (duration <= maxDuration && duration >= minDuration){
            this.duration = duration;
        }
        if (volume <= maxVolume && volume >= minVolume) {
            this.volume = volume;
        }
        if (brightness <= maxBrightness && brightness >= minBrightness) {
            this.brightness = brightness;
        }
    }

    @Override
    public void play() {
        System.out.println("Sto riproducendo il video: " + title);

        do {
            System.out.print(title + " ");
            for(int i =0; i < volume; i++) {
                System.out.print("!");
            }
            for(int i =0; i < brightness; i++) {
                System.out.print("*");
            }
            duration --;
            System.out.println();
        } while(duration > minDuration);

    }

    @Override
    public void reduceBrightness() {
        if (brightness > minBrightness) {
            brightness--;
        }
    }

    @Override
    public void increaseBrightness() {
        if (brightness < maxBrightness) {
            brightness++;
        }
    }

    @Override
    public void show(){
        play();
    }

    @Override
    public void reduceVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }

    @Override
    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0){
            this.duration = duration;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= maxVolume && volume >= minVolume) {
            this.volume = volume;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness <= maxBrightness && brightness >= minBrightness) {
            this.brightness = brightness;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}