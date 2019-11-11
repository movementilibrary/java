package java8.test;

import java.util.Arrays;
import java.util.List;

public class SomaArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        list.stream().mapToInt(integer -> integer+1).forEach(s -> System.out.println(s));

    }
}
