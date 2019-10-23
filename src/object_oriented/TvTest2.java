package object_oriented;

class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1 의 channel 값은 "+t1.channel+"입니다.");
		System.out.println("t2 의 channel 값은 "+t2.channel+"입니다.");
		
		t1.channel = 7;
		System.out.printf("t1의 channel값을 %d로 변경하였습니다.",t1.channel);
		System.out.println();
		
		System.out.println("t1 의 channel 값은 "+t1.channel+"입니다.");
		System.out.println("t2 의 channel 값은 "+t2.channel+"입니다.");
	}
}

