import java.text.DecimalFormat;

public class UniversityGrading_ex1 {
    /*
    * returns all the grades below 40 -> the failed grades
    * */
    public int[] failedNotes(int[] grades){
        int[] failed = new int[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] <= 40){
               failed = append(grades[i], failed);
            }
        }
        return failed;
    }

    private int[] append(int newElem, int[] oldArray){
        /*
        A methode to append to an array
        */
        int[] newArray = new int[oldArray.length + 1];
        for(int i = 0; i < oldArray.length; i++){
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newElem;
        return newArray;
    }

    public double average(int[] grades){
        /*
        * Calculates the average grade from an array of grades
        * */
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        DecimalFormat df = new DecimalFormat("#.00");

        double average = (double)sum / grades.length;

        return Double.parseDouble(df.format(average));
    }

    public int[] round(int[] grades){
        /*
        * Rounds the grades that end to 3,4,8,9 and are greater than 38
        * */
        int[] newArray = new int[grades.length];
        for(int i = 0; i < grades.length; i++){
            if (grades[i] < 38)
                newArray[i] = grades[i];
            else if(grades[i] % 10 == 8 || grades[i] % 10 == 9 ||
                    grades[i] % 10 == 3 || grades[i] % 10 == 4)
                newArray[i] = roundToFive(grades[i]);
            else newArray[i] = grades[i];
        }
        return newArray;
    }

    private int roundToFive(int number){
        /*
        * A methode for the "round" function that rounds to the nearest multiple of 5
        * */
        int reminder = number % 5;
        if (reminder == 0)
            return number;
        else return number + 5 - reminder;
    }

    public int maxGradeAfterRound(int[] grades){
        /*
        * The biggest grade of the array
        * */
        int max = Integer.MIN_VALUE;
        grades = round(grades);
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > max)
                max = grades[i];
        }
        return max;
    }
}
