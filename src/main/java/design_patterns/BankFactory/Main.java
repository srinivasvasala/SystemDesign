package design_patterns.BankFactory;

public class Main {
    public static void main(String[] args) {
        BankingFactory savingFactory = new SavingAccountFactory();
        HDFCBankingSystem hdfcSavingSystem = new HDFCBankingSystem(savingFactory);
        hdfcSavingSystem.setupAccount();
        hdfcSavingSystem.setupCard();
    }
}
