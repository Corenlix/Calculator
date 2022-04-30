package NumberReaders.ArabicReader;

import NumberReaders.INumberReader;

public class ArabicNumberReaderImpl implements INumberReader {

    @Override
    public int read(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException exception) {
            throw new ArithmeticException();
        }
    }
}
