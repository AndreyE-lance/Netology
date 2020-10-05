package task322.Tax;

import java.math.BigDecimal;
import java.math.MathContext;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.13));
    }
}
