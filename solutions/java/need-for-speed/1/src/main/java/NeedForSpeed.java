class NeedForSpeed {
     int speed;
     int batteryDrain;
     int distance;
     int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    
    public boolean batteryDrained() {
       return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {

        if(!batteryDrained()){
        distance += speed; 
        battery -= batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distanceTrack;
    RaceTrack(int distance) {
        this.distanceTrack = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        //check if the availbale battery will be able to cover the distance at the cars speed
        int totDistCarCover = car.speed * (100/car.batteryDrain);

        //check if the total distance a car can cover is greater than the track distance
        return totDistCarCover >= distanceTrack;
        
    }
}
