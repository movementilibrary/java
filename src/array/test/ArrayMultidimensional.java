package array.test;

public class ArrayMultidimensional {

    public static void main(String[] args) {

//        int [][] dias = new int[3][];
//
//        dias[0] = new int[2];
//        dias[1] = new int[]{1,2,3};
//        dias[2] = new int [4];

        int[][] dias = {{0,0}, {1,2,3}, {6,7,8,9}};

        for (int [] arr : dias) {
            for (int num: arr) {
                System.out.println(num);
            }
        }
    }
}
