package access;

public class Speaker {
    private int volume;

    Speaker(int volume){this.volume = volume;}

    void volumeUp(){
        if(volume>=100){
            System.out.println("you can't");
        }
        else {
            volume += 10;
            System.out.println("10 up");
        }
    }
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }
}
