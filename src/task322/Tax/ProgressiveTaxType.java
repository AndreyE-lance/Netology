package task322.Tax;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal resultTax= new BigDecimal(0);
        if(amount.compareTo(BigDecimal.valueOf(100000))<=0){
            resultTax = amount.multiply(BigDecimal.valueOf(0.1));
        } else if(amount.compareTo(BigDecimal.valueOf(100000))>0){
            resultTax = amount.multiply(BigDecimal.valueOf(0.15));;
        }
        return resultTax;
    }
}
