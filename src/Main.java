public class Main {
    public static void main(String[] args) {

        zadanie1();
        zadanie2();
    }

    public static void zadanie1()
        {
            int x;
            int y;

            x = 10;
            y = 5;

            System.out.println(x + y);
            System.out.println(x - y);
            System.out.println(x * y);
            System.out.println(x / y);
        }


        public static double zadanie2()
        {

        int[] numbers = new int[]{1, 6, 16, 21};

        int sum = 0;

        double average = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        average = sum / numbers.length;

        return(average);
        }

}