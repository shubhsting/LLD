package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.TEMPLATE_PATTERN;

public class Main {
    public static void main(String[] args) {
        PaymentFlow flow = new PayToMerchant();
        flow.sendMoney();
    }
}
