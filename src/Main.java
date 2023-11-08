import java.util.Arrays;

public class Main {
    public static int[] reversed(int[] array){
        int i=0;
        int j= array.length-1;
        int holdingVal=0;
        while(i<j){
            holdingVal=array[i];
            array[i]=array[j];
            array[j]=holdingVal;

            i++;
            j--;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] testArray={1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(reversed(testArray)));
    }
}
