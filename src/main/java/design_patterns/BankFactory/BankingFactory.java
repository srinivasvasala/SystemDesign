package design_patterns.BankFactory;

public interface BankingFactory {
    public Account createAccount();
    public Card createCard();
}
