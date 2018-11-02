package com.encore.day08;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] arr = new Shape[2]; //�迭����
		
		arr[0] = new Rectangle(5,6);
		arr[1] = new RectTriangle(6,2);
		
		for(Shape s:arr) { //�迭 arr, shapeŸ���� s
			
			System.out.println("area:" + s.getArea());
			System.out.println("perimeter:" + s.getPerimeter());
			
			//size ����(�簢���� ����)
			
			if(s instanceof Resizable) {
				
				Resizable r = (Resizable)s; // ������ ������ �� �� �ֱ� ������ �� ��ȯ�� ����� �Ѵ�.
				//Rectangle r = (Rectangle)s �� �����ϴ�.
				r.resize(0.5);
	
				System.out.println("new area:" + s.getArea());
				System.out.println("new perimeter:" + s.getPerimeter());	
			}
		}

	}

}
