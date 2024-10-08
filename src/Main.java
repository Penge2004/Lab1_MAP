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
    }
}