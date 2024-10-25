package design_patterns.BankFactory;

import javax.smartcardio.Card;

public class CurrentAccountFactory implements BankingFactory {
    @Override
    public Account createAccount() {
        return new CurrentAccount();
    }

    @Override
    public Card createCard() {
        return new CreditCard();
    }
}
