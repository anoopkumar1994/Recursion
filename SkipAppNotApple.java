public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("abcappledef"));
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
