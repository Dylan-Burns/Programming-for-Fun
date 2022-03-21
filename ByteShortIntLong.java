public class ByteShortIntLong {

    public static void main(String[] args) {
//
//        byte num1 = Byte.MAX_VALUE;
//        byte num2 = Byte.MIN_VALUE;
//
//        short num3 = Short.MAX_VALUE;
//        short num4 = Short.MIN_VALUE;
//
//        int num5 = Integer.MAX_VALUE;
//        int num6 = Integer.MIN_VALUE;
//
//        long num7 = Long.MAX_VALUE;
//        long num8 = Long.MIN_VALUE;
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(num5);
//        System.out.println(num6);
//        System.out.println(num7);
//        System.out.println(num8);

        byte num1 = 10;
        short num2 = 20;
        int num3 = 50;
        long num4 = 50_000L + (10L * (num1 + num2 + num3));

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
