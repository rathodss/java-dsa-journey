public class Smallest {

    public static void main(String args[]) {
        int x = 1;
        int y = 10;
        int z = 7;
        if (x < y && x < z) {
            System.out.println("Smallest number is X : " + x);
        } else if (y < z) {
            System.out.println("Smallest number is y : " + y);
        } else
            System.out.println("Smallest number is z : " + z);

    }

}
