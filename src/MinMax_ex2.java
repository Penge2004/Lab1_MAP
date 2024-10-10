public class MinMax_ex2 {
    public int max(int[] numbers){
        int max = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }

    public int min(int[] numbers){
        int min = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }

    public int minimalSum(int[] numbers){
        /*
        * The minimal sum with n-1 elements
        * */
        int maxNr = max(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum - maxNr;
    }

    public int maximalSum(int[] numbers){
        /*
         * The maximal sum with n-1 elements
         * */
        int minNr = min(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum - minNr;
    }
}
