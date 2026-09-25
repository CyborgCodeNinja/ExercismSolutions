public class JedliksToyCar {
    private int metersDriven;
    private int batteryPercentage;

    //constructor
    public JedliksToyCar(){
        batteryPercentage = 100;
        metersDriven = 0;
    }
    
    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        //get the distance
       return "Driven "+metersDriven+" meters";

    }

    public String batteryDisplay() {
        if(batteryPercentage==0){
            return "Battery empty";
        }

        return "Battery at "+batteryPercentage+"%";
    }

    public void drive() {
        if(batteryPercentage>0){
            metersDriven +=20;
            batteryPercentage--;
        }
    }
}
