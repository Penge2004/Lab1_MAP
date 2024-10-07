public class UniversityGrading {
    public int[] failedNotes(int[] grades){
        int[] failed = new int[1];
        int j = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] <= 40){
                failed[j] = grades[i];
                j++;
            }
        }
        return failed;
    }
}
