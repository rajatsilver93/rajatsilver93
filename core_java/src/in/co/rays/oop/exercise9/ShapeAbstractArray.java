package in.co.rays.oop.exercise9;

public class ShapeAbstractArray {
	
		public static void main(String[] args) {
			ShapeAbstract[] s = new ShapeAbstract[3];
			s[0] = new RectangleAbstract();
			s[1] = new CircleAbstract();
			s[2] = new TriangleAbstract();
			double totalArea = calcArea(s);
			System.out.println(totalArea);

		}

		static double calcArea(ShapeAbstract[] s) {
			double totalArea = 0;

			for (int i = 0; i < s.length; i++) {
				totalArea += s[i].area();
			}
			return totalArea;
		}


}
