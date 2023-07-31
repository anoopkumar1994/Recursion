import java.util.ArrayList;
import java.util.List;

public class ParmutationsString {

    public static void main(String[] args) {
//       parmuta("", "abc");

       ArrayList<String> ans = parmutationsList("", "ABC");
        System.out.println(ans);
    }
    static void parmuta(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            parmuta(f + ch + s, str.substring(1));
        }
    }

    static ArrayList<String> parmutationsList(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return (list);
        }
        char ch = str.charAt(0);
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            res.addAll(parmutationsList(f + ch + s, str.substring(1)));
        }
        return res;
    }
}
