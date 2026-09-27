public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salMultipl = daysSkipped >= 5 ? 0.85 : 1.0;
        return salMultipl;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = productsSold>=20 ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus = bonusMultiplier(productsSold) * productsSold;
        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        //multiply the base salary
        double salMal = salaryMultiplier(daysSkipped);

        //calculate the bonus
        double bonus = bonusForProductsSold(productsSold);

        //final salary
        double salary  = 1000 * salMal + bonus;

        if(salary > 2000.00){
            salary = 2000;
        }
        return salary;
    } 
}
