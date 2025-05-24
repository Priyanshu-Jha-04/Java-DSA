package DSA_02_Sorting_Teachniques;

public class Sorting_04_MergeSort {

    public static void merge_sort(int arr[], int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        merge_sort(arr, low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high) {
        
    }
    public static void main(String[] args) {

    }
}
