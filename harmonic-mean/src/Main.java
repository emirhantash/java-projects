public class Main {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6};
        double add = 0.0, avg;

        for(int i : array)
            add += (1.0/i);

        System.out.println("Harmonic Series: " + add);
        avg = array.length/add;
        System.out.println("Harmonic Means: " + avg);

    }
}