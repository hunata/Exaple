import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        printArray(arr);
        System.out.println("sum: "+ sumElements(arr));

    }
        public static void printArray(int[] arr){
            for (int i=0; i<arr.length; i++){
                System.out.format("%d, ", arr[i]);
            }
            System.out.println();

        }
        public static int sumElements(int[] arr){
        int ret=0;
        for (int ele : arr){
            ret += ele;
        }
        return ret;

        }
        public static void sortArray(int[] arr){
            for (int i=0; i<arr.length-1; i++){
                for(int j= i+1; j<arr.length;j++){
                    if(arr[i] > arr[j]){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }


            }

        }


//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(arr[3]);
//        for (int i=0; i<arr.length;i++){
//            System.out.format("%d, ",arr[i]);
//        }Sys
//
//int j=0;
//        while (j<arr.length){
//            System.out.format("%d, ",arr[j]);
//            j++;
//        }
////nhớ check lại video phần này
//

    }

