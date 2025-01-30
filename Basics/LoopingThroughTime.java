//Learn the different looping mechanisms available in Java.
public class LoopingThroughTime {
    public static void main(String[] args) {
        // Using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i + " using For Loop");
        }

        // Using while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration " + i + " using While Loop");
            i++;
        }

        // Using do-while loop
        int j = 1;
        do {
            System.out.println("Iteration " + j + " using Do-While Loop");
            j++;
        } while (j <= 5);
    }
}
