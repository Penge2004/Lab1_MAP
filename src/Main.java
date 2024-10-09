import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        UniversityGrading_ex1 universityGrading = new UniversityGrading_ex1();
        int[] grades = new int[]{29,37,38,41,84,67};
        System.out.println(Arrays.toString(universityGrading.failedNotes(grades)));
        System.out.println(universityGrading.average(grades));
        System.out.println(Arrays.toString(universityGrading.round(grades)));
        System.out.println(universityGrading.maxGradeAfterRound(grades));
        System.out.println();

        MinMax_ex2 minMax = new MinMax_ex2();
        int[] n = new int[]{4,8,3,10,17};
        System.out.println(minMax.min(n));
        System.out.println(minMax.max(n));
        System.out.println(minMax.minimalSum(n));
        System.out.println(minMax.maximalSum(n));
        System.out.println();


        BigNumber_ex3 bigNumber = new BigNumber_ex3();
        int[] a_add = new int[]{1,3,0,0,0,0,0,0,0};
        int[] b_add = new int[]{8,7,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(bigNumber.add(a_add,b_add)));
        int[] a_sub = new int[]{8,3,0,0,0,0,0,0,0};
        int[] b_sub = new int[]{5,4,0,0,0,0,0,0,0};
//        int[] a_sub = new int[]{1,1,0,0,0,0,5,0,0};
//        int[] b_sub = new int[]{1,0,0,0,0,0,6,0,0};
        System.out.println(Arrays.toString(bigNumber.subtract(a_sub,b_sub)));
    }
}