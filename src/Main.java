/**
 * Created by Nastya on 19.02.2016.
 */
public class Main {
    public static void main(String[] args){
        int [] arr = {6,3,8,2,3,};
        int result = MyMath.findMin(arr);
        System.out.println(result);
        result = MyMath.findMax(arr);
        System.out.println(result);

        System.out.println(MyMath.arrayOfCircle(1));
        System.out.println(MyMath.arrayOfCircle(2));
    }
}
