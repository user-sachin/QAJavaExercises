public class UniqueSum {

    int inputUniqueSumIntegerOne;
    int inputUniqueSumIntegerTwo;
    int inputUniqueSumIntegerThree;

    public UniqueSum() {

    }

    public UniqueSum(int inputUniqueSumIntegerOne, int inputUniqueSumIntegerTw, int inputUniqueSumIntegerThree) {
        this.inputUniqueSumIntegerOne = inputUniqueSumIntegerOne;
        this.inputUniqueSumIntegerTwo = inputUniqueSumIntegerTwo;
        this.inputUniqueSumIntegerThree = inputUniqueSumIntegerThree;
    }

    public int doUniqueSum(int inputUniqueSumIntegerOne, int inputUniqueSumIntegerTwo, int inputUniqueSumIntegerThree) {
        int result;
        if (inputUniqueSumIntegerOne == inputUniqueSumIntegerTwo) {
            if (inputUniqueSumIntegerOne == inputUniqueSumIntegerThree) {
                result = 0;
            } else {
                result = inputUniqueSumIntegerThree;
            }
        } else {
            if (inputUniqueSumIntegerOne == inputUniqueSumIntegerThree) {
                result = inputUniqueSumIntegerTwo;
            } else if (inputUniqueSumIntegerTwo == inputUniqueSumIntegerThree) {
                result = inputUniqueSumIntegerOne;
            } else {
                result = inputUniqueSumIntegerOne + inputUniqueSumIntegerTwo + inputUniqueSumIntegerThree;
            }
        }
        return result;
    }
}
