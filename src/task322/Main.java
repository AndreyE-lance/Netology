package task322;

import task322.Tax.IncomeTaxType;
import task322.Tax.ProgressiveTaxType;
import task322.Tax.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(new BigDecimal(30000.57), new VATaxType(), taxService),
                new Bill(new BigDecimal(500051.32), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(10000.21), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(70000.79), new IncomeTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
