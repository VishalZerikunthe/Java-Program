package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={5,4,8,6,2,1,7};
        System.out.print("[ ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}

class Decending{
    public static void main(String[] args) {
        int[]arr={5,4,8,6,2,1,7};
        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
