public class InvalidAgeEXception extends ArithmeticException {
    public InvalidAgeEXception(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir INvaliadAge EXception");
    }
}
