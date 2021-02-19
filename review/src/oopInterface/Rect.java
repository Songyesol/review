package oopInterface;


public class Rect 
		extends Shape  				  //속성,메서드 위주 
		implements Drawable, Movable // 동작(method) 위주(추상메서드)
{
	

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}
	@Override
	public void draw(){
		System.out.println("사각형 그리기");
	}
}
