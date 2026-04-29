package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능. this는 자기 자신을 뜻함
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }

}
