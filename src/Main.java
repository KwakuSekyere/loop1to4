public class Main {
    public static void main(String[] args) {
        // Problem 1: Counting up by 1 from 0 to 30
        System.out.println("Counting up by 1 from 0 to 30:");
        // Loop from 0 to 30, incrementing by 1 each time
        for (int i = 0; i <= 30; i++) {
            // Print the current value of i followed by a space
            System.out.print(i + " ");
        }
        // Print a newline to move to the next line
        System.out.println(); // newline

        // Problem 2: Counting down by 1 from 30 to 0
        System.out.println("Counting down by 1 from 30 to 0:");
        // Loop from 30 to 0, decrementing by 1 each time
        for (int i = 30; i >= 0; i--) {
            // Print the current value of i followed by a space
            System.out.print(i + " ");
        }
        // Print a newline to move to the next line
        System.out.println(); // newline

        // Problem 3: Counting up by 3 from 0 to 18
        System.out.println("Counting up by 3 from 0 to 18:");
        // Loop from 0 to 18, incrementing by 3 each time
        for (int i = 0; i <= 18; i += 3) {
            // Print the current value of i followed by a space
            System.out.print(i + " ");
        }
        // Print a newline to move to the next line
        System.out.println(); // newline

        // Problem 4: Counting down by 2 from 10 to 0
        System.out.println("Counting down by 2 from 10 to 0:");
        // Loop from 10 to 0, decrementing by 2 each time
        for (int i = 10; i >= 0; i -= 2) {
            // Print the current value of i followed by a space
            System.out.print(i + " ");
        }
        // Print a newline to move to the next line
        System.out.println(); // newline
    }
}
