package examples.netSalary.services;

public class BrazilTaxService extends TaxService{

    @Override
    public Double tax(double amount){
        return amount * 0.3;
    }
}
