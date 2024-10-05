package entities;

public class IndividualTaxPayer extends TaxPayer{
    private Double healthExpenditures;

    public IndividualTaxPayer(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        Double totalTax;
        // verifica a porcentagem a ser tributada:
        if (getAnnualIncome() < 20000) {
            totalTax = getAnnualIncome() * 0.15;
        }
        else {
            totalTax = getAnnualIncome() * 0.25;
        }
        // verifica se houve gastos com saúde e efetua o desconto:
        if (this.healthExpenditures != null) {
            totalTax -= this.healthExpenditures * 0.5;
        }
        return totalTax;
    }
}
