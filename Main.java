import java.util.Random;

public class Main {
    public static int count = 100000;

    public static void main(String[] args) {
        odd();
        tenside();
        evenOdd();
        threedie();
        fourdie();
    }

    public static void odd() {
        int numtrue = 0;
        int numfalse = 0;
        Random rand = new Random();
        System.out.println("Scenario: Expected result 50%");
        for (int i = 0; i < count; i++) {
            int roll = rand.nextInt(6) + 1;
            if (roll % 2 == 1) {
                numtrue++;
            } else {
                numfalse++;
            }
        }
        float percent = ((float) numtrue / (float) count) * 100;
        System.out.println("Count of True: " + numtrue);
        System.out.println("Count of False: " + numfalse);
        System.out.println("Condition reached " + percent + "%");
        System.out.println();
    }

    public static void tenside() {
        int numtrue = 0;
        int numfalse = 0;
        Random rand = new Random();
        System.out.println("Scenario: Expected result 70%");
        for (int i = 0; i < count; i++) {
            int roll = rand.nextInt(10) + 1;
            if (roll % 2 == 0) {
                numtrue++;
            } else if (roll > 5) {
                numtrue++;
            } else {
                numfalse++;
            }
        }
        float percent = ((float) numtrue / (float) count) * 100;
        System.out.println("Count of True: " + numtrue);
        System.out.println("Count of False: " + numfalse);
        System.out.println("Condition reached " + percent + "%");
        System.out.println();
    }

    public static void evenOdd() {
        int numtrue = 0;
        int numfalse = 0;
        Random rand = new Random();
        System.out.println("Scenario: Expected result 25%");
        for (int i = 0; i < count; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                numtrue++;
            } else {
                numfalse++;
            }
        }
        float percent = ((float) numtrue / (float) count) * 100;
        System.out.println("Count of True: " + numtrue);
        System.out.println("Count of False: " + numfalse);
        System.out.println("Condition reached " + percent + "%");
        System.out.println();
    }

    public static void threedie() {
        int numtrue = 0;
        int numfalse = 0;
        Random rand = new Random();
        System.out.println("Scenario: Expected result 3.7%");
        for (int i = 0; i < count; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            if ((roll1 <= 2) && (roll2 > 2) && (roll2 < 5) && (roll3 > 4)) {
                numtrue++;
            } else {
                numfalse++;
            }
        }
        float percent = ((float) numtrue / (float) count) * 100;
        System.out.println("Count of True: " + numtrue);
        System.out.println("Count of False: " + numfalse);
        System.out.println("Condition reached " + percent + "%");
        System.out.println();
    }
    public static void fourdie() {
        int numtrue = 0;
        int numfalse = 0;
        Random rand = new Random();
        System.out.println("Scenario: Expected result 27.7%");
        for (int i = 0; i < count; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;
            if ((roll1 != roll2) && (roll1 != roll3) && (roll2 != roll3) && (roll3 !=roll4)&&(roll1 != roll4)&& (roll2 != roll4)) {
                numtrue++;
            } else {
                numfalse++;
            }
        }
        float percent = ((float) numtrue / (float) count) * 100;
        System.out.println("Count of True: " + numtrue);
        System.out.println("Count of False: " + numfalse);
        System.out.println("Condition reached " + percent + "%");
        System.out.println();
    }
}
