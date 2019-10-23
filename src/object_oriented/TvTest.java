package object_oriented;

class Tv{
	// Tv 속성
	String color;
	boolean power;
	int channel;
	
	// Tv method
	void power()       {power =!power;} // tv 키거나 끄는 기능
	void channelUp()   {++channel;}		// tv 채널 올리는 기능
	void channelDown() {--channel;}		// tv 채널 내리는 기능
}

class TvTest {
	public static void main(String args[]) {
		Tv t; // Tv 인스턴스
		t         = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
	}
}

