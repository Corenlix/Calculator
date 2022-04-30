package NumberOutputs.ArabicOutput;

import NumberOutputs.INumberOutput;

public class ArabicOutputImpl implements INumberOutput {

    @Override
    public String get(int number) {
        return Integer.toString(number);
    }
}
