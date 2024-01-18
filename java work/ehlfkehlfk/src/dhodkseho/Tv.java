package dhodkseho;

public class Tv {
	

		String color;// 기본값 null
		boolean power;// 기본값 false
		int channel;// 초기값 0

		void power() {
			System.out.println("power 버튼 누름.");
			power = !power;
		}

		void channelUp() {
			System.out.println("채널 올리기");
		}

		void channelDown() {
			System.out.println("채널 내리기");
			channel-=1;
			if(channel==-1) {
				System.out.println("채널이 음수라서 0으로 초기화함");
				channel=0;
			}
		}

	}

