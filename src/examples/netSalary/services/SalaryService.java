package examples.netSalary.services;

import examples.netSalary.entities.Employee;

public class SalaryService {

    //FORMA CORRETA
    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public Double netSalary(Employee employee){
        return employee.getGrossSalary()
                - taxService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());

    }
}
