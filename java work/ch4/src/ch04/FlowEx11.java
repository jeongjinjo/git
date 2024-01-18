package ch04;
import java.util.*;

class FlowEx11 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(7); // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����

		switch(gender) {
			case '1':
				System.out.println("2000년 이전에 태어난 남자입니다.");
			case '3':
				System.out.println("2000년 이후에 출생한 남자입니다.");
		}
		break;
		case '2';
		case '4':
			switch(gender) {
			case'2':
				System.out.println("2000ㅕㄴ 이전에 출생한 여자 입니다.");
				
				
				}
				break;
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");;
		}
	} // main�� ��
}
