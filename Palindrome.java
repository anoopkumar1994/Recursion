public class Palindrome {
    public static void main(String[] args) {
       int sum= 0, num, p;
       num = 1212;
       p = palindrome(num, sum);
      
       if(p == num){
        System.out.println("is palindrome");
       }else{
        System.out.println("is not palindrome");
       }
    }
    static int palindrome(int num, int sum){
        if(num == 0){
            return sum;
        }
        sum = (sum*10)+(num%10);
        return palindrome(num/10, sum);
    }
}
