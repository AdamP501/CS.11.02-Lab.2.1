import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int sum = add(1,3);
        System.out.println(sum);

        int sum2 = add(1,2,3,4);
        System.out.println(sum2);

        String MG = morningGreeting("Sander");
        System.out.println(MG);

        String AG = afternoonGreeting("Sander");
        System.out.println(AG);

        String trip = triple("big");
        System.out.println(trip);

        double halved = half(10);
        System.out.println(halved);

        int posRounded = roundPositiveValueToNearestInteger(10.5);
        System.out.println(posRounded);

        int negRounded = roundNegativeValueToNearestInteger(-20.4);
        System.out.println(negRounded);


    }

    // 1. add
    public static int add(int a, int b)
    {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        int sum1 = add(a, b);
        int sum2 = add(c,  d);
        return add(sum1, sum2);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name)
    {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name)
    {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String str)
    {
        return str + str + str;
    }

    // 6. half
    public static double half(int num)
    {
        double myNum = num;
        return myNum/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num)
    {
        return (int) Math.round(num);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num)
    {
        double myNum = Math.abs(num);
        return (int) Math.round(myNum)*-1;
    }

}
