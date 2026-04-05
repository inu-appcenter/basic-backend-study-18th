package Section7;

public class SpeakerMain {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        /* private int volume로 변경 컴파일 오류 발생
        speaker.volume = 200;
        speaker.showVolume(); // Boom!
        */
    }
}
