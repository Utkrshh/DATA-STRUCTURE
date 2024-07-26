public class fact {
    public static void main(String[] args) {
        int n = 10;
        int s = 1;
        
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        
        System.out.println("Factorial of " + n + " is " + s);
    }
}
