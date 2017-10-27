public class BlackJack {

    int inputBJIntegerOne;
    int inputBJIntegerTwo;

    public BlackJack(){

    }
    public BlackJack(int inputBJIntegerOne, int inputBJIntegerTwo){
        this.inputBJIntegerOne = inputBJIntegerOne;
        this.inputBJIntegerTwo = inputBJIntegerTwo;
    }


    public int doBlackJack(int inputBJIntegerOne, int inputBJIntegerTwo) {
        int result;
        if (inputBJIntegerOne > 21 && inputBJIntegerTwo > 21) {
            result = 0;
        } else {
            if (inputBJIntegerOne > 21) {
                result = inputBJIntegerTwo;
            } else if (inputBJIntegerTwo > 21) {
                result = inputBJIntegerOne;
            } else {
                if (inputBJIntegerOne > inputBJIntegerTwo) {
                    result = inputBJIntegerOne;
                } else {
                    result = inputBJIntegerTwo;
                }
            }
        }
        return result;
    }
}
