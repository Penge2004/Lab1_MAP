import java.util.Arrays;

public class BigNumber_ex3 {
    public int[] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        int carryFlag = 0;
        for(int i=a.length-1; i>=0; i--) {
            int sum =a[i]+b[i];

            if (carryFlag == 1) {
                sum += carryFlag;  // for each element in the two input arrays we add them together and
                carryFlag = 0;     // we add the carry flag to it
            }
            if (sum >= 10){
                carryFlag = 1;   // we have carry flag if we exceed 10, then we save the last digit and the
                sum = sum % 10;     // first digit will be the carry flag for the next position
            }
            result[i] = sum;
        }

        if (carryFlag == 1) {  // if we have a carry flag at the end we need to have one extra slot in the
            int[] temp = new int[a.length+1]; // final result array
            temp[0] = 1;
            for (int i = 1; i <= a.length; i++)
                temp[i] = result[i - 1];
            result = temp;
        }

        return result;
    }

    /*
    * The majority of the following methods are same as the "add" methode
    * It handles the edge cases as well
    * */

    public int[] subtract(int[] a, int[] b) {
        int[] result = new int[a.length];
        for(int i=a.length-1; i>=0; i--) {
            if(a[i] < b[i]) {
                int j = i;
                while (a[j-1] == 0){
                    a[j-1] = 9;  // here is the case handled, when the next left digit is 0 and we cannot
                                // borrow from there
                    j--;
                }
                a[j-1] -= 1;
                a[i] += 10;
            }
            result[i] = a[i] - b[i];
        }
        int j = 0;
        while(result[j]==0){
            j++;
        }
        if(result[0]==0){
            int[] temp = new int[result.length - j];
            int i = 0;
            for(int k = j; k<result.length; k++) { // crops the result not to save zeros before the
                temp[i] = result[k];                // first digit
                i++;
            }
            result = temp;
        }
        return result;
    }

    public int[] multiply(int[] a, int b) {  // Similar as "add"
        int[] result = new int[a.length];
        int carryFlag = 0;
        for(int i=a.length-1; i>=0; i--) {
            int multip = a[i] * b;
            result[i] = multip % 10 + carryFlag;
            carryFlag = multip / 10;

        }
        if (carryFlag != 0) {
            int[] temp = new int[a.length+1];
            temp[0] = carryFlag;
            for (int i = 0; i < a.length; i++)
                temp[i+1] = result[i];
            result = temp;
        }

        return result;
    }

    public int[] divide(int[] a, int b) {
        /*
        * This function is more complicated, because the division happens in a specific pattern
        * which includes dividing, than the result is multiplied back with the divisor  "b" and then
        * subtracted from the dividend.
        * We have a carry flag if we have rest after the subtraction
        * */
        int[] result = new int[a.length];
        int carryFlag = 0;
        for (int i=0;i<a.length;i++) {
            result[i] = (10*carryFlag + a[i])/b;
            int multiplyBack = result[i] * b;
            carryFlag = (10*carryFlag + a[i]) - multiplyBack;
        }
        int detectZero = 0;
        while(result[detectZero] == 0) {
            detectZero++;
        }
        if (detectZero != 0) {
            int[] temp = new int[a.length-detectZero];  // crops the zeros before the first non-zero digit
            for(int i = 0; i < a.length-detectZero; i++) {
                temp[i] = result[detectZero+i];
            }
            result = temp;
        }
        return result;
    }
}
