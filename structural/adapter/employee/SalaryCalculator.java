package adapter.employee;

public class SalaryCalculator {
    public static double calcSalary(Employee employee){
        return employee.getSalary() * 1.2;
    }
}
