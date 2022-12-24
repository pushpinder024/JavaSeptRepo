package DEC_24_DEMO.Enum2;

public class Gucci {
    private String articeleNo;
    private GucciSizes size;
    private String color;


    public Gucci(String articeleNo, GucciSizes size, String color) {
        this.articeleNo = articeleNo;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gucci{" +
                "articeleNo='" + articeleNo + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Proceed to place an order");
        Gucci g = new Gucci("12", GucciSizes.MEDIUM, "Black");
        System.out.println(g);
    }
}
