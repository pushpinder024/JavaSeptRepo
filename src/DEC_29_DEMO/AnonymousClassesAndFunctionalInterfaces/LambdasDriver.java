package DEC_29_DEMO.AnonymousClassesAndFunctionalInterfaces;

public class LambdasDriver {
    public static void main(String[] args) {

//         Interface Name        Variable Name          Method          Lambda Sign               Implementation
        AnonymousVsFunctionalInterface AI          =         ()                ->               System.out.println("stfu");

//      Call to method
        AI.Igame();


//        startPlay(AI);    //     <------ Here we passed a function(AI),thus Functional Programming
 /////////////SAME THING\\\\\\\\\\\\\\\
        startPlay( ()                ->               System.out.println("stfu") );
        startPlay( ()                ->               System.out.println("stfuoadfhoad") );






//       No need to write RETURN keyword here, as the implementation is only one line
//        AnonymousVsFunctionalInterface AI = (a) -> 5+a;

        }

        public static void startPlay(AnonymousVsFunctionalInterface o){
        o.Igame();
        }

    }

