package behavioral.chain_of_responbility;

import behavioral.chain_of_responbility.domain.DivideNumbers;
import behavioral.chain_of_responbility.domain.MultiplyNumbers;
import behavioral.chain_of_responbility.domain.Numbers;
import behavioral.chain_of_responbility.domain.SubtractNumbers;
import behavioral.chain_of_responbility.logic.AddNumbers;
import behavioral.chain_of_responbility.logic.Chain;

public class TestCalcChain {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "add");

        chainCalc1.calculate(request);
    }
}
