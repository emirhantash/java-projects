public class Main {
    public static void main(String[] args) {
        int counter = 0, i, j;
        for(i = 2; i <=100 ; i++){
            for(j = 2; j < i; j++) {
                if(i % j == 0){
                    counter++;
                    break;
                }
            }
            if(counter == 0)
                System.out.print(i + " ");
            counter = 0;
        }
    }
}