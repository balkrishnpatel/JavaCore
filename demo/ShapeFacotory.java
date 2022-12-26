package demo;

public abstract class ShapeFacotory implements Shape {
	/*public Shape getShape(String shaptype) {
		if (shaptype==null) {
			return null;
		}
		if (shaptype.equalsIgnoreCase("CIRCLE")){
			System.out.println("ShapeFacotory.getShape()");
			return new Circle();
		}else if(shaptype.equalsIgnoreCase("RECTANGLE")) {
			System.out.println("ShapeFacotory.getShape()");
			return new Rectangle();
		} else if(shaptype.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}*/
	
	 protected Shape decoratedShape;

	   public ShapeFacotory(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }
}
