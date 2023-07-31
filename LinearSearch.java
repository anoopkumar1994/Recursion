import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,1,1,10,55,33};
        int target = 1;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(lastSearchOccur(arr, target, arr.length-1));
        findAll(arr, target, 0);
        System.out.println(list);
        System.out.println(findAllRep(arr, target, 0, new ArrayList<Integer>()));
    }
    // Search first target element
    static int linearSearch(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
            return linearSearch(arr, target, index+1);
    }

    // Search last target element  
    static int lastSearchOccur(int arr[], int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index; 
        }else{
            return lastSearchOccur(arr, target, index-1);
        }
    }

    // Find All Index in an elements
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int arr[], int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
            findAll(arr, target, index+1);
    }

    // Search first and last index 
    static ArrayList findAllRep(int arr[], int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllRep(arr, target, index+1, list);
    }
}
