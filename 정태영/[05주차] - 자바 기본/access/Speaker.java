package access;

public class Speaker {

    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUP(){
        if(volume >= 100)
            System.out.println("최대 음량입니다");
        else{
            volume += 10;
            System.out.println("음량 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        if(volume < 0) volume = 0;

        System.out.println("음량 10 감소합니다.");
    }

    void showVolume(){
        System.out.println("현재 음량 : " + volume);
        if(volume > 100) System.out.println("과부하 발생! 폭발합니다!!");
    }
}

