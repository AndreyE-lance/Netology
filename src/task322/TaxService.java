package task322;

import java.math.BigDecimal;


class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.5f (неокругленное)\n",taxAmount);
        System.out.format("Уплачен налог в размере %.5f (округленное с точностью до 2х знаков и типом округления ROUND_HALF_EVEN)\n", taxAmount.setScale(2,BigDecimal.ROUND_HALF_EVEN));
    }
}