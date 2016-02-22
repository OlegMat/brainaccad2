/**
 * Created by Nastya on 19.02.2016.
 */
public class MyMath {

    final static double PI = 3.14;

    public static double arrayOfCircle(int radius){
        return PI*Math.pow(radius, 2);
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        return  min;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
