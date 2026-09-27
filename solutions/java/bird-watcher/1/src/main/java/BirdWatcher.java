
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithout = false;
        for(int birdsPerD:birdsPerDay){
            if(birdsPerD==0){
                dayWithout = true;    
            }
        }
        return dayWithout;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int lengthOfArr = birdsPerDay.length;
        if(numberOfDays>lengthOfArr){
            numberOfDays = lengthOfArr;
        }

        for(int i=0;i<numberOfDays;i++){
            count += birdsPerDay[i];
         }
        return count;
    }

    public int getBusyDays() {
        int busyDay =0;
        for(int birdsPerD:birdsPerDay){
            if(birdsPerD>=5){
                busyDay++;
            }
        }
        return busyDay;
    }
}
