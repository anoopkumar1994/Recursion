public class Nreverse {
    public static void main(String[] args) {
        int n = 5;
        rev(n);
    }

    static void rev(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        rev(n-1);
    }
}
