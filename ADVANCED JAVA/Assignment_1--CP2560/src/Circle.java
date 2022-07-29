public class Circle extends Shape{
    private int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    @Override
    public double Area() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String getDescription() {
        return String.format("Circle with a radius of %d and an area of %f",  radius, Area());
    }
}
