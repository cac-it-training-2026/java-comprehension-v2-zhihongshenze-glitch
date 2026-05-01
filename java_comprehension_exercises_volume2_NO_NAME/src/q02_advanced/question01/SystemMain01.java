package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する

		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member1 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		member.showMember();
		member1.showMember();
	}

}
