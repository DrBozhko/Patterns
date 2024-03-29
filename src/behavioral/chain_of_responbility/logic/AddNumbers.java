package behavioral.chain_of_responbility.logic;

import behavioral.chain_of_responbility.domain.Numbers;

public class AddNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "add") {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "
                    + (request.getNumber1() + request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
