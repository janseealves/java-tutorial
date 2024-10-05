package entities;

public class CompanyTaxPayer extends TaxPayer{
    private Integer numberOfEmployees;

    public CompanyTaxPayer(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        Double totalTax;
        if (this.numberOfEmployees > 10) {
            totalTax = getAnnualIncome() * 0.14;
        }
        else {
            totalTax = getAnnualIncome() * 0.16;
        }
        return totalTax;
    }
}
