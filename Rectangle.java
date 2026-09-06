class AreaOfRectangle{
    private double length;
    private double width;

    public void setLength ( double length) {
        if (length < 0) {
            System.out.println( " Invalid length");
        }
        else {
            this.length = length;
        }
    }
    public void getLength () {
        System.out.println( " Length of rectangle = " + length);
    }
    public void setWidth( double width) {
        if ( width < 0) {
            System.out.println(" Invalid width");
        }
        else {
            this.width = width;
        }
    }
    public void getWidth() {
        System.out.println( " Width of rectangle = " + width);
    }

    public void getArea () {
        System.out.println( " Area of rectangle = " + width * length);
    }
    public void getParameter() {
        System.out.println( " Parameter of rectangle = " + 2 * (length + width));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        AreaOfRectangle rect1 = new AreaOfRectangle();

        rect1.setLength(6);
        rect1.getLength();
        rect1.setWidth(8);
        rect1.getWidth();
        rect1.getArea();
        rect1.getParameter();
    }
}