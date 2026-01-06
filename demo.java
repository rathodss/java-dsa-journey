class calculator {

    public int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }
}

public class demo {
    public static void main(String args[]) {

        calculator calc = new calculator();

        int r = calc.add(3, 5, 8);
        //
        System.out.println(r);
    }
}
