
/*
String
성적관리 프로그램
번호 이름   국어 영어 수학
[0]["홍길동"][100,80,90]
[1]["이길동"][70,90,100]
[2]["박길동"][80,70,200]

 */



public class Ex03 {

    public static void main(String[] args) {
        String[] student1={"홍길동","10","20","30"};
        String[] student2={"이길동","70","90","80"};
        String[] student3={"박길동","100","90","40"};

        String[][] all={student1,student2,student3};

        System.out.println("학생의 숫자= "+all.length+"명");

        for(int i=0;i<all.length;i++){
            int sum=0;
            for(int i=0; i<all.length; i++){
                sum=Integer.parseInt(all[i][1]);
            }
            System.out.println("국어점수의 총합"+sum);
            System.out.println("국어점수의 평균"+sum/all.length);
        }


        //학생의 숫자, 국어평균점수,영어평균점수,수학평균점수


    }
}
