package design_patterns.BankFactory;

public class SavingAccountFactory implements BankingFactory{
    @Override
    public Account createAccount() {
        return new SavingAccount();
    }

    @Override
    public Card createCard() {
        return new DebitCard();
    }
}
