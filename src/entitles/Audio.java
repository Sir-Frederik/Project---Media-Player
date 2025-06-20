package entitles;

import interfaces.Riproducible;



public class Audio extends MultimediaElement implements Riproducible {

private int duration;
private int volume;

 public Audio(String title, int duration, int volume){
    super(title);
    if (duration <= maxDuration && duration >= minDuration){
        this.duration = duration;
    };
    if (volume <= maxVolume && volume >= minVolume) {
        this.volume = volume;
    };

 }

    @Override
    public void play() {
        System.out.println("Sto riproducendo il brano  musicale: " + title);

        do {
            System.out.print(title + " ");
        for(int i =0; i < volume; i++) {
                System.out.print("!");

            };
            duration --;
            System.out.println();
        }while(duration > minDuration);
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
        if (duration >0){
            this.duration = duration;
        }
    }

    public int getVolume() {

            return volume;

    }

    public void setVolume(int volume) {
        if (volume <= maxVolume && volume >= minVolume) {
            this.volume = volume;
        };
    }

    @Override
    public String toString() {
        return "Audio{" +
                "durata=" + duration +
                ", volume=" + volume +
                '}';
    }


}

