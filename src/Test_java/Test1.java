package Test_java;
//import SimponCharacter.SimpsonCharacter;

import java.util.*;

public class Test1 {

    public static void main(String... args) {
        List a = new ArrayList();
        int a1[] = {1};
        int a2[] = {2};
        int a3[] = {3};
        a.add(0,a1);
        a.add(1,a2);

        for (Object element: a){
            System.out.println(element);
//            System.out.println(a1[0]);
        }


//        List<SimpsonCharacter> characters = new ArrayList<>();
//
//        SimpsonCharacter homer = new SimpsonCharacter("Homer") {
//            @Override
//            public int compareTo(SimpsonCharacter simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//
//        SimpsonCharacter moe = new SimpsonCharacter("Moe") {
//            @Override
//            public int compareTo(SimpsonCharacter simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//
//        characters.add(homer);
//        characters.add(moe);
//
//        Collections.sort(characters);
//
//        System.out.println(characters);
    }

}
