public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboo(4));
    }

    static int fiboo(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fiboo(n-1) + fiboo(n-2);
    }
}
