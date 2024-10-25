package design_patterns.BankFactory;

public class HDFCBankingSystem {
    private Account account;
    private Card card;

    public HDFCBankingSystem(BankingFactory factory) {
        account = factory.createAccount();
        card = factory.createCard();
    }
    public void setupAccount() {
        account.getAccountType();
    }
    public void setupCard() {
        card.getCardType();
    }
}
