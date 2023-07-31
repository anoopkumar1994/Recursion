public class StringSubset {
    public static void main(String[] args) {
        subSet("", "abc");
    }
    static void subSet(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSet(ch + ans, str.substring(1));
        subSet(ans, str.substring(1));
    }
}
