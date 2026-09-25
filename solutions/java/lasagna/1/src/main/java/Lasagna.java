public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int expectedMinutes = 40;
        return expectedMinutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        int remaingInOven = 40 - actualMinutes;
        return remaingInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers){
        int preparationTime = numOfLayers * 2;
        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers,int minutesInOven){
        int prepTime = new Lasagna().preparationTimeInMinutes(numOfLayers);
        int sunPrepTime = prepTime + minutesInOven;
        return sunPrepTime;
    }
}
