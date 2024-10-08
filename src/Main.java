import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        UniversityGrading universityGrading = new UniversityGrading();
        int[] grades = new int[]{29,37,38,41,84,67};
        System.out.println(Arrays.toString(universityGrading.failedNotes(grades)));
        System.out.println(universityGrading.average(grades));
        System.out.println(Arrays.toString(universityGrading.round(grades)));
        System.out.println(universityGrading.maxGradeAfterRound(grades));

    }
}