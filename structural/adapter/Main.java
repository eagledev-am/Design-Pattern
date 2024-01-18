package adapter;

import adapter.employee.Employee;
import adapter.employee.MachineOperator;
import adapter.employee.SalaryCalculator;

public class Main {
    // adapter
    // when we have an incompatible interface
    // when we have old service ( that accept data )
    // and we have new type of data
    // implement the old service and inject to the new service
    public static void main(String[] args) {

        Employee employee = new Employee("abdo" , 500000.0);
        System.out.println("Employee salary : "  + SalaryCalculator.calcSalary(employee));

        MachineOperator machineOperator = new MachineOperator("Ahmed" , 50000);
//        System.out.println(SalaryCalculator.calcSalary(machineOperator)); error ( expect to accept employee )
        SalaryAdapter salaryAdapter = new SalaryAdapter(machineOperator);
        System.out.println("Machine operator salary" + salaryAdapter.calcSalary());

    }
}