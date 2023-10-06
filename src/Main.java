public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int x) {
        if (x>=90) return 'A';
        else if (x>=80) return 'B';
        else if (x>=70) return 'C';
        else if (x>=60) return 'D';
        else if (x>=50) return 'E';
        return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int x) {
        if (x%3==0 && x%5==0) return "fizzbuzz";
        else if (x%3==0) return "fizz";
        else if (x%5==0) return "buzz";
        else return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String x) {
        if (x.length()>=2) {
            return x.charAt(0) + "" + x.charAt(1) + x + x.charAt(0) + x.charAt(1);
        }
        else return x;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return (a+b==c || (b+c==a || a+c==b));
    }
    // Question 5 - endUp
    public static String endUp(String x) {
        if (x.length()>=3) return x.substring(0,x.length()-3) + x.substring(x.length()-3).toUpperCase();
        else return x.toUpperCase();
    }
}
