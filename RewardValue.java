public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert cash to miles
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
    }

    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }
}
