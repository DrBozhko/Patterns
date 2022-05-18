package behavioral.chain_of_responbility.logic;

import behavioral.chain_of_responbility.domain.Numbers;

public interface Chain {
    void setNextChain(Chain nextChain);

    void calculate(Numbers request);
}
