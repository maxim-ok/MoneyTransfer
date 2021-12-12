public class MoneyTransfer {
    public static void main(String[] args) {
        int currentAccountSum = 2_000_000_000;
        int transferSum = 500_000_000;
        int totalAccountSum = transferSum + currentAccountSum;

        System.out.println("Итого на счете " + totalAccountSum + " попугаев");
    }
}
