public class TooHot {

    int temperature;
    boolean isSummer;

    public TooHot() {

    }

    public TooHot(int temperature, boolean isSummer) {
        this.temperature = temperature;
        this.isSummer = isSummer;
    }

    public boolean doTooHot(int temperature, boolean isSummer) {
        boolean result;

        int lowerLimit = 60;
        int higherLimit = 90;
        if (isSummer) {
            higherLimit = 100;
        }

        if (temperature > lowerLimit && temperature < higherLimit) {
            result = true;
        } else {
            result = false;

        }
        return result;
    }
}
