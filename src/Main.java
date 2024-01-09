
public class Main {

    static int IntNum1 = 3;
    static int IntNum2 = 6;
    static double DoubleNum1 = 13.5;
    static double DoubleNum2 = 11.5;

    static float FloatNum1 = 12.4F;
    static float FloatNum2 = 10;
    static Discriminant discriminant = (double a, double b, double c) -> {
        return b * b - 4 * a * c;
    };
    static DivisibleBy13WithoutRemainder divisible = (double number) -> {
        return !(number % 13 > 0);
    };
    static Sum sum = (Number num1, Number num2) -> {

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) num1 + (int) num2;
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (float) num1 + (float) num2;
        } else {
            return (double) num1 + (double) num2;
        }
    };


    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Divisible By 13 Without Remainder:");
        System.out.println(divisible.check(13));
        System.out.println("Discriminant:");
        System.out.println(discriminant.calculateDiscriminant(3, 4, 5));
        System.out.println("int Sum:");
        System.out.println(sum.Sum(IntNum1, IntNum2));
        System.out.println("double Sum:");
        System.out.println(sum.Sum(DoubleNum1, DoubleNum2));
        System.out.println("float Sum:");
        System.out.println(sum.Sum(FloatNum1, FloatNum2));

    }
}