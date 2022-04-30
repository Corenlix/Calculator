public class ArabicNumberReader implements INumberReader {

    @Override
    public int read(String number) {
        try {
            return Integer.parseInt(number);
        }
        catch (Exception exception){
            throw new ArithmeticException();
        }
    }
}
