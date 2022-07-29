public class Main {
    public static void main(String[] args) {

        String[] shapes = new String[5];


        shapes[0] = new ShapeGenerator().newShape().toString();
        shapes[1] = new ShapeGenerator().newShape().toString();
        shapes[2] = new ShapeGenerator().newShape().toString();
        shapes[3] = new ShapeGenerator().newShape().toString();
        shapes[4] = new ShapeGenerator().newShape().toString();
        System.out.println();

        for (String shape: shapes){
            System.out.println(shape);
        }

    }
}
