package org.example;

class MobilePhone {
    /*
    import java.Lang.
    기본생성자 생략가능->다른 생성자 선언한면 기본생성자 생략불가
    super();->생략가능
    toString(); ->생략가능

     */
    protected String number;

    public MobilePhone(String number){
        this.number=number;
    }
    public void answer(){
        System.out.println("대답해따 번호는"+number);

    }

}
class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String number,String ver) {
        super(number);
        this.androidVer=ver;
    }
    public void playApp(){
        System.out.println("앱 실행함 안드로이드 버전은="+androidVer);
    }
}
public class Main3{
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone("01093348928","1.0");
        sp.playApp();
        sp.answer();

        //부모객체      //자식객체
        //자식객체는 부모객체에 담을 수 있다.
        //부모객체는 자식객체를 참조할 수 있다.
        //다형성이라고 한다...
        MobilePhone mp=new SmartPhone("0101248273293","2.0");
                mp.answer();

    }
}