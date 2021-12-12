public class MoneyTransfer {
    public static void main(String[] args) {
        int currentAccountSumm = 2_000_000_000;
        int transferSumm = 500_000_000;
        int totalAccountSumm = transferSumm + currentAccountSumm;

        System.out.println("Итого на счете " + totalAccountSumm + " попугаев");
    }
}
