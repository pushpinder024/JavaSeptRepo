package DEC_24_DEMO.InnerClasses;

public class OuterClasses {

    private String firstName;
    private String lastName;

        public OuterClasses(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
        }

    @Override
    public String toString() {
        return "OuterClasses{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

   static class InnerClass{
                private String UserName;
                private String password;
                public void login(){
                        System.out.println("Logged in successfully");
                }
        }


        public static void main(String[] args) {
                OuterClasses o1 =  new OuterClasses("Pushpinder","Singh");
            System.out.println(o1);



            OuterClasses.InnerClass o2 = new InnerClass();
            o2.login();


        }
}
