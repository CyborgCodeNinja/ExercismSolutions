class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canFastAttack = true;
        if(knightIsAwake){
            canFastAttack = false;
        }
        return canFastAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = true;
        if(!knightIsAwake==true&&!archerIsAwake==true&&!prisonerIsAwake==true){
            canSpy = false;
        }
        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       boolean canSignal = true;

        if(archerIsAwake&&!prisonerIsAwake||!archerIsAwake&&!prisonerIsAwake||archerIsAwake&&prisonerIsAwake){
            canSignal = false;
        }

        return canSignal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    return (petDogIsPresent && !archerIsAwake)
            || (!petDogIsPresent
                && !knightIsAwake
                && !archerIsAwake
                && prisonerIsAwake);
    }
}
