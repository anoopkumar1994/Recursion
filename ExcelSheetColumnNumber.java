public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int charValue = c - 'A' + 1;
            columnNumber = columnNumber * 26 + charValue;
        }
        return columnNumber;
    }

    static int colNum(String columnTitle, int ans){
        if(columnTitle.isEmpty()){
            return ans;
        }
        char ch = columnTitle.charAt(0);
        int charVal = ch - 'A' + 1;
        return colNum(columnTitle.substring(1), ans * 26 + charVal);
    }

    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
        System.out.println(colNum(columnTitle, 0));
    }
}

