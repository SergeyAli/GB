/**
 * program
 * 
 * public class program {
 * public static void main(String[] args) {
 * System.out.println("wor");
 * }
 * 
 * }
 */
// Основы: типы данных
class Program {
    public static void main(String[] args) {
        // short age = 10;
        // int salary = 123456;
        // System.out.println(age); //10
        // System.out.println(salary); //123456

        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415

        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // *Строки не так просты

        // String msg ="Hello world";
        // System.out.println(msg); // Hello world

        // Неявная типизация

        // var a = 123;
        // System.out.println(a); // 123
        // var d = 123.456;
        // System.out.println(d); // 123.456

        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double
        // }
        // static String getType(Object o){
        // return o.getClass().getSimpleName();

        // классы-обертки

        // System.out.println(Integer.MAX_VALUE); // 2147483647
        // System.out.println(Integer.MIN_VALUE); // -2147483648

        // Массивы
        // Одномерные

        // System.out.println(arr.length); // 10

        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

        // Многомерные

        // int[] arr[] = new int[3][5];
        // for (int[] line : arr) {
        // for (int item : line) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        // }

        // int[][] arr = new int[3][5];
        //
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.printf("%d ", arr[i][j]);
        // }
        // System.out.println();
        // }


    }
}
