package object_oriented;

class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1 �� channel ���� "+t1.channel+"�Դϴ�.");
		System.out.println("t2 �� channel ���� "+t2.channel+"�Դϴ�.");
		
		t1.channel = 7;
		System.out.printf("t1�� channel���� %d�� �����Ͽ����ϴ�.",t1.channel);
		System.out.println();
		
		System.out.println("t1 �� channel ���� "+t1.channel+"�Դϴ�.");
		System.out.println("t2 �� channel ���� "+t2.channel+"�Դϴ�.");
	}
}

