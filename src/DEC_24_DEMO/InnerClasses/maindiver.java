package DEC_24_DEMO.InnerClasses;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class maindiver {
    public static void main(String[] args) {
        Student s1 =  new Student() {
            @Override
            public void sleep() {
                System.out.println("The student is sleeping");
            }

            @Override
            public void play() {
                System.out.println("The student is playing");
            }

            @Override
            public void eat() {
                System.out.println("The student is eating");
            }
        };

        s1.eat();
        s1.sleep();
        s1.play();


        Comparator c1 =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Comparable c2  =  new Comparable() {
            @Override
            public int compareTo(@NotNull Object o) {
                return 0;
            }
        };
    }
}
