package entity;

public class funcionario1 {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percent){
        grossSalary += grossSalary * percent / 100;
    }

    public String toString(){
        return "Funcionario:" + name + ", $" 
        + String.format("%.2f", netSalary());
    }
}
