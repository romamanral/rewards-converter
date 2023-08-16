import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true); // Specify isMiles as true
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200;
        double conversionRate = 0.0035; // Conversion rate should be in miles per cash
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / conversionRate;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue( ));
    }



    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;
        double conversionRate = 0.0035; // Conversion rate should be in cash per mile
        var rewardValue = new RewardValue(milesValue, true); // Specify isMiles as true
        double expectedCashValue = milesValue * conversionRate;
        assertEquals(expectedCashValue, rewardValue.getCashValue( ));
    }
}
