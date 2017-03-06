
/**
 * Write a description of class MergeSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergeSort
{
    public int[] mergeSort(int[] items){
        if(items.length > 1){
            int[] arr1 = new int[items.length / 2];
            int[] arr2 = new int[items.length - arr1.length];
            for(int i=0; i<items.length / 2;i++){
                arr1[i] = items[i];
            }
            for(int i=items.length/2;i<items.length;i++){
                arr2[i - items.length/2] = items[i];
            }
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            return merge(arr1, arr2);
        } else {
            return items;
        }
    }
    
    public int[] merge(int[] arr1, int[] arr2){
        int n=0;
        if(arr1.length < arr2.length){
            n = arr1.length;
        } else {
            n = arr2.length;
        }
        
        int i=0;
        int j=0;
        int k=0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return arr;
    }
    
    public void main(){
        int[] val = {1 , 5, 2, 4, 2, 3, 10, 20, 4, 11};
        System.out.print("Unsorted: ");
        for(int i: val){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Sorted: ");
        for(int i: mergeSort(val)){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
