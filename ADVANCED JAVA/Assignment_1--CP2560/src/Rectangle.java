public class Rectangle extends Shape{
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(){
        this.length = length;
    }
    public void setWidth(){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public String getDescription() {
        return String.format("Rectangle with a length of %.2f, a width of %.2f and an area of %.2f",  length, width, Area());
    }
}


