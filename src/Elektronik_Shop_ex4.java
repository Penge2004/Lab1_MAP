import java.util.Arrays;

public class Elektronik_Shop_ex4 {
    /*
    * A simple min methode
    * */
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
        /*
        * Searches the most expensive keyboard or usb, depending on which one is more expensive
        * */
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
    public int mostExpensiveAffordableUsb(int[] usbPrices, int budget) {
        /*
        * Returns the most expensive usb that the user can afford (has the budget for it)
        * */
        int mostExpensive = Integer.MIN_VALUE;
        for (int i = 0; i < usbPrices.length; i++) {
            if(mostExpensive < usbPrices[i] && usbPrices[i] <= budget)
                mostExpensive = usbPrices[i];
        }
        return mostExpensive;
    }
    public int maxExpence(int[] keyboardPrices, int[] usbPrices, int budget) {
        /*
        * Returns the value of a combination of an usb and a keyboard
        * The combination is the most expensive one, that is affordable for the user
        * */
        keyboardPrices = Arrays.stream(keyboardPrices).sorted().toArray();
        usbPrices = Arrays.stream(usbPrices).sorted().toArray();
        for (int i = keyboardPrices.length - 1; i >= 0; i--) {
            for (int j = usbPrices.length - 1; j >= 0; j--) {
                if(keyboardPrices[i] + usbPrices[j] <= budget)
                    return keyboardPrices[i] + usbPrices[j];
            }
        }
        return -1;
    }
}
