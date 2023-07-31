public class CheckSortwdOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,17,12};
        System.out.println(sortedOrNot(arr, 0));
    }
    
    static boolean sortedOrNot(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortedOrNot(arr, index+1);  
    }
   
}
