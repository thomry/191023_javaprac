package object_oriented;

class Tv{
	// Tv �Ӽ�
	String color;
	boolean power;
	int channel;
	
	// Tv method
	void power()       {power =!power;} // tv Ű�ų� ���� ���
	void channelUp()   {++channel;}		// tv ä�� �ø��� ���
	void channelDown() {--channel;}		// tv ä�� ������ ���
}

class TvTest {
	public static void main(String args[]) {
		Tv t; // Tv �ν��Ͻ�
		t         = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� "+t.channel+" �Դϴ�.");
	}
}

