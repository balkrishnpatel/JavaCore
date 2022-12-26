package demo;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		/*ShapeFacotory factory = new ShapeFacotory();
		
		Shape shap = factory.getShape("CIRCLE");
		shap.draw();
		Shape sh = factory.getShape("SQUARE");
		sh.draw();
		Shape ss= factory.getShape("RECTANGLE");
		ss.draw();*/
		Shape circle = new Circle();
		Shape bcircle = new RedShapeDecorator(new Circle());
		Shape redcircle = new RedShapeDecorator(new Rectangle());
		circle.draw();
		System.out.println("Circle with normal border");
		bcircle.draw();
		System.out.println("\nCircle of red border");

		redcircle.draw();

	}
}
