package design_patterns.BankFactory;

public class BusinessAccountFactory implements BankingFactory{
    @Override
    public Account createAccount() {
        return new BusinessAccount();
    }

    @Override
    public Card createCard() {
        return new PrepaidCard();
    }
}
