import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        //create the random number 
        int index = random.nextInt(10);

        //use the index to get the char
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        //generate a random number
        int number = random.nextInt(9999 - 1000 + 1)+1000;

        //return the Registry number
        return "NCC-"+number;
    }

    double randomStardate() {
        return random.nextDouble(42000.0 - 41000.0 )+41000.0;
    }
}
