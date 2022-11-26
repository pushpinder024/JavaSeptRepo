package NOV_19_DEMO.OOPS;

public class circleBlueprint {
    public static final  double PI = 3.14;
    public int radius;

    public circleBlueprint(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
           double area  = PI * radius*radius;
         return area;
     }

    public double calculatePerimeter(){
           double perimeter = 2* PI * radius;
         return perimeter;
    }

    @Override
    public String toString() {
        return "circleBlueprint{" +
                "radius=" + radius +
                "      area=" + calculateArea()+
                "      perimeter=" + calculatePerimeter()+
                '}';
    }
}
