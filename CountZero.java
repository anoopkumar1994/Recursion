public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(20304000));
    }
    static int countZero(int n){
        return helperFun(n, 0);
    }
    static int helperFun(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helperFun(n/10, c+1);
        }
        return helperFun(n/10, c);
    }
}
