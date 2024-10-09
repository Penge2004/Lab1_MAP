import java.util.Arrays;

public class BigNumber_ex3 {
    public int[] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        int carryFlag = 0;
        for(int i=a.length-1; i>=0; i--) {
            int sum =a[i]+b[i];

            if (carryFlag == 1) {
                sum += carryFlag;
                carryFlag = 0;
            }
            if (sum >= 10){
                carryFlag = 1;
                sum = sum % 10;
            }
            result[i] = sum;
        }

        if (carryFlag == 1) {
            int[] temp = new int[a.length+1];
            temp[0] = 1;
            for (int i = 1; i <= a.length; i++)
                temp[i] = result[i - 1];
            result = temp;
        }

        return result;
    }

    public int[] subtract(int[] a, int[] b) {
        int[] result = new int[a.length];
        for(int i=a.length-1; i>=0; i--) {
            if(a[i] < b[i]) {
                int j = i;
                while (a[j-1] == 0){
                    a[j-1] = 9;
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
            for(int k = j; k<result.length; k++) {
                temp[i] = result[k];
                i++;
            }
            result = temp;
        }
        return result;
    }

    public int[] multiply(int[] a, int b) {
        int[ ] result = new int[a.length];

        return result;
    }
}
