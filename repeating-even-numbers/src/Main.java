import java.util.Arrays;
public class Main {
    static boolean isFind(int[] array, int value){
        for(int i: array){
            if(i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 4, 4, 6, 6};
        int[] duplicated = new int[list.length];
        int[] evenNumbers = new int[duplicated.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicated, list[i]))
                        duplicated[startIndex++] = list[i];
                    break;
                }
            }
        }
        startIndex = 0;
        for(int i = 0; i < duplicated.length; i++){
            if(duplicated[i] % 2 == 0)
                evenNumbers[startIndex++] = duplicated[i];
        }
        System.out.print("Duplicated even numbers:");
        for(int value : evenNumbers){
            if(!(value == 0))
                System.out.print(" " + value);
        }
    }
}