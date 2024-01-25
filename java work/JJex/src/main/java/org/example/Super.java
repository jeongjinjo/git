package org.example;

class SuperCls {

    public void doA(){
        System.out.println("SuperCls doA"   );
    }
}
class SubCls extends SuperCls{
//오버라이드이 재정의 오버로딩은 매개변수가 다른 함수명이 동일해도 된다. ..
}

class Super{

public static void main(String[] args) {
    SuperCls sc = new SuperCls();
    sc.doA();
}
 }

