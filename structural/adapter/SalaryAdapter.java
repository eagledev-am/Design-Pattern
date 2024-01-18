package adapter;

import adapter.employee.Employee;
import adapter.employee.MachineOperator;
import adapter.employee.SalaryCalculator;

public class SalaryAdapter extends SalaryCalculator{
    private static MachineOperator machineOperator;
    SalaryAdapter(MachineOperator mOperator){
        machineOperator = mOperator;
    }
    public double calcSalary(){
        Employee employee = new Employee(machineOperator.getName() , machineOperator.getSalary());
        employee.setSalary(machineOperator.getSalary());
        return employee.getSalary() * 1.2;
    }
}
