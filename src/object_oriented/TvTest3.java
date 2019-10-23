package object_oriented;

class TvTest3 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이 3인 Tv 객체 배열
		
		// Tv 객체 생성해서 Tv객체 배열의 각 요소에 저장
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for (int i =0; i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}

	}

}
