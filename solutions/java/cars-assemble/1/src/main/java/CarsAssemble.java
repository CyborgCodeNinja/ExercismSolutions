public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prodRate = 0;

        if(speed <= 4){
            prodRate = speed * 221;
        }else if(speed>=5&&speed<=8){
            prodRate = (speed * 221) * 0.90;
        }else if(speed==9){
            prodRate = (speed * 221) * 0.80;
        }else{
            prodRate = (speed * 221) * 0.77;
        }
        return prodRate;
    }

    public int workingItemsPerMinute(int speed) {
        //call the production method
        double prodRate = productionRatePerHour(speed);

        //get the working items in minutes
        int workItemsMin = (int)prodRate/60;

        return workItemsMin;
    }
}
