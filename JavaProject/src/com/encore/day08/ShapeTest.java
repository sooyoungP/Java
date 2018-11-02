package com.encore.day08;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] arr = new Shape[2]; //배열생성
		
		arr[0] = new Rectangle(5,6);
		arr[1] = new RectTriangle(6,2);
		
		for(Shape s:arr) { //배열 arr, shape타입의 s
			
			System.out.println("area:" + s.getArea());
			System.out.println("perimeter:" + s.getPerimeter());
			
			//size 조정(사각형만 가능)
			
			if(s instanceof Resizable) {
				
				Resizable r = (Resizable)s; // 하위가 상위에 들어갈 수 있기 때문에 형 변환을 해줘야 한다.
				//Rectangle r = (Rectangle)s 도 가능하다.
				r.resize(0.5);
	
				System.out.println("new area:" + s.getArea());
				System.out.println("new perimeter:" + s.getPerimeter());	
			}
		}

	}

}
