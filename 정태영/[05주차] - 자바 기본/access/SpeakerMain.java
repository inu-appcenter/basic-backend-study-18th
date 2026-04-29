package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUP();
        speaker.showVolume();

        speaker.volumeUP();
        speaker.showVolume();

        //speaker.volume = 200;
        speaker.showVolume();
    }
}