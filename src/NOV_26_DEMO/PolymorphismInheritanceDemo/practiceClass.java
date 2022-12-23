package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class practiceClass {
    public static void main(String[] args) {
        Bank b  = new Bank();
        b.setFirstName("NAMAN");
        b.setLastName("Kumar");
        b.setBankAccountNumber("27852837");
        b.setLastName("Malhi");
        System.out.println(b);
        System.out.println(b.getFirstName());
    }
}
