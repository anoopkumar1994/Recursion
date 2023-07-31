public class SkipWords {
    public static void main(String[] args) {
        System.out.println(skipStr("baccab", ""));
    }
    static String skipStr(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
       char ch = str.charAt(0);

        if(ch == 'a'){
            return skipStr(str.substring(1),ans);
        }
            return skipStr(str.substring(1),ch + ans);
    }
}
