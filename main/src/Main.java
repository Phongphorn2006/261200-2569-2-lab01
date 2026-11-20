import java.util.*;
import java.lang.IO;

public class Main {

    public void main() throws Exception {
        int[] num = getNum();
        selectionSort(num);
        for(int i = 0;i < num.length ;i++ ) {
            IO.println(num[i]);
        }
    }

    void selectionSort(int[] arr ){
        int n = arr.length;
        for (int i = 0;i < n-1; i++){
            int min = i;
            for ( int j = i + 1;j < n;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    int[] getNum() throws Exception {
        Scanner s = new Scanner(System.in);
        IO.print("Enter your counting numbers : ");
        int n = s.nextInt();
        if (n < 0){
            throw new Exception("not a nonnegative integer");
        }
        int num[] = new int[n];

        for (int i = 0;i < n ;i++){
            IO.print(i + 1 +". Number : ");
            if (s.hasNextInt()){
                num[i] = s.nextInt();
            } else {
                throw new Exception("please enter integer number");
            }
        }
        return num;
    }
}

//credit Selection Sort by GeeksforGeeks
