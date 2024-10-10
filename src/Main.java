import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        UniversityGrading_ex1 universityGrading = new UniversityGrading_ex1(); // tests for exercise 1
        int[] grades = new int[]{29,37,38,41,84,67};
        System.out.println(Arrays.toString(universityGrading.failedNotes(grades)));
        System.out.println(universityGrading.average(grades));
        System.out.println(Arrays.toString(universityGrading.round(grades)));
        System.out.println(universityGrading.maxGradeAfterRound(grades));
        System.out.println();

        MinMax_ex2 minMax = new MinMax_ex2();// tests for exercise 2
        int[] n = new int[]{4,8,3,10,17};
        System.out.println(minMax.min(n));
        System.out.println(minMax.max(n));
        System.out.println(minMax.minimalSum(n));
        System.out.println(minMax.maximalSum(n));
        System.out.println();


        BigNumber_ex3 bigNumber = new BigNumber_ex3();     // tests for exercise 3
        int[] a_add = new int[]{1,3,0,0,0,0,0,0,0};
        int[] b_add = new int[]{8,7,0,0,0,0,0,0,0};       // test from example
        System.out.println(Arrays.toString(bigNumber.add(a_add,b_add)));
        int[] a_sub = new int[]{8,3,0,0,0,0,0,0,0};
        int[] b_sub = new int[]{5,4,0,0,0,0,0,0,0};         // test from example
//        int[] a_sub = new int[]{1,1,0,0,0,0,5,0,0};       // test for testing an edge case
//        int[] b_sub = new int[]{1,0,0,0,0,0,6,0,0};
        System.out.println(Arrays.toString(bigNumber.subtract(a_sub,b_sub)));
        System.out.println();
//        int[] a_mul = new int[]{2,3,6,0,0,0,0,0,0};  // test for testing an edge case
        int[] a_mul = new int[]{8,0,0};
        int b_mul = 2;
        System.out.println(Arrays.toString(bigNumber.multiply(a_mul,b_mul)));
        System.out.println();
//        int[] a_div = new int[]{2,3,6,0,0,0,0,0,0};  // test for testing an edge case
        int[] a_div = new int[]{1,6,0,0};
        int b_div = 2;
        System.out.println(Arrays.toString(bigNumber.divide(a_div,b_div)));
        System.out.println();

        Elektronik_Shop_ex4 elektronik = new Elektronik_Shop_ex4(); // tests for exercise 4
        int[] keyBoards = new int[]{40,35,70,15,45};
        System.out.println(elektronik.cheapestKeyboard(keyBoards));
        keyBoards = new int[]{15,10,20,35};
        int[] usbs = new int[]{20,15,40,15};
        System.out.println(elektronik.mostExpensiveItem(keyBoards,usbs));
        System.out.println(elektronik.mostExpensiveAffordableUsb(usbs,25));
        keyBoards = new int[]{40,50,60};
        usbs = new int[]{8,12};
        System.out.println(elektronik.maxExpence(keyBoards,usbs,60));
        keyBoards = new int[]{60};
        System.out.println(elektronik.maxExpence(keyBoards,usbs,60));

    }
}