package access;

public class SpeakerMain {
    static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근 가능함 => 접근을 막는 방법은??? : private 제어자 사용하기(Speaker에서 확인)
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; 불가능
        speaker.showVolume();
    }
}
