class PrintOneToN{
    public static void main(String[] args) {
        System.out.println(printN(1));
    }
    static int printN(int n){
        if(n == 5){
            return n;
        }
        System.out.println(n);
        return printN(n+1);
    }
}