import java.util.Arrays;

public class Elektronik_Shop_ex4 {
    public int cheapestKeyboard(int[] keyboardPrices) {
        int cheapest = Integer.MAX_VALUE;
        for (int i = 0; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < cheapest) {
                cheapest = keyboardPrices[i];
            }
        }
        return cheapest;
    }

    public int mostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int mostExpensive = Integer.MIN_VALUE;
        for (int i = 0; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] > mostExpensive)
                mostExpensive = keyboardPrices[i];
        }
        for (int i = 0; i < usbPrices.length; i++) {
            if (usbPrices[i] > mostExpensive)
                mostExpensive = usbPrices[i];
        }
        return mostExpensive;
    }
    public int mostExpensiveAffordableUsb(int[] usbPrices, int buget) {
        int mostExpensive = Integer.MIN_VALUE;
        for (int i = 0; i < usbPrices.length; i++) {
            if(mostExpensive < usbPrices[i] && usbPrices[i] <= buget)
                mostExpensive = usbPrices[i];
        }
        return mostExpensive;
    }
    public int maxExpence(int[] keyboardPrices, int[] usbPrices, int buget) {
        keyboardPrices = Arrays.stream(keyboardPrices).sorted().toArray();
        usbPrices = Arrays.stream(usbPrices).sorted().toArray();
        for (int i = keyboardPrices.length - 1; i >= 0; i--) {
            for (int j = usbPrices.length - 1; j >= 0; j--) {
                if(keyboardPrices[i] + usbPrices[j] <= buget)
                    return keyboardPrices[i] + usbPrices[j];
            }
        }
        return -1;
    }
}
