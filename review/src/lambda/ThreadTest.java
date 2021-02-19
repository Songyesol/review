package lambda;

public class ThreadTest {

	public static void main(String[] args) {
		

		
		//multi thread 
		Thread thread = new Thread(new Thread1());
		thread.start(); 
		
		//무명클래스 대신에 쓰는게 람다식...!
		Thread thread2 = new Thread(new Runnable(){
			public void run() {
				for(int i = 2000; i<2999; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}} );
		thread2.start(); 
		
		//람다식(클래스 선언과 객체생성 한번에 == 무명클래스) ,오버라이딩 해야할 메서드가 하나뿐일때만 사용가능)
		Thread thread3 = new Thread(
				() -> {
					for(int i = 3000; i<3999; i++) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(i);
					}
				}
			);
		
		thread3.start(); 
		
		for(int i = 1000; i<1999; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
