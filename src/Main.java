import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static   void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[]={2,3,4,1,5,6};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                  if(arr[j]>arr[i]){
                      int temp=arr[j];
                      arr[j]=arr[i];
                      arr[i]=temp;
                  }
            }
        }
        for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

    }
}