class Main {
    public static void main(String[] args) {
        UniversityGrading universityGrading = new UniversityGrading();
        int[] grades = new int[]{29,37,38,41,84,67};
        System.out.println(universityGrading.failedNotes(grades));

    }
}