import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //create formattter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        //formatte
        LocalDateTime theDate = LocalDateTime.parse(appointmentDateDescription,formatter);

        return theDate;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        //create todays date
        LocalDateTime today = LocalDateTime.now();

        //compare the dates
        return today.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        //get the time from the date
        int timeInDate = appointmentDate.getHour();
        boolean passed = false;
        //check
        if(timeInDate>=12&&timeInDate<18){
            passed = true;
        }

        return passed;
    }

    public String getDescription(LocalDateTime appointmentDate) {
    // Get the day of the week
    String dayOfWeek = appointmentDate.getDayOfWeek().toString();

    // Convert day to title case
    String dayOfWk = dayOfWeek.substring(0, 1).toUpperCase()
            + dayOfWeek.substring(1).toLowerCase();

    // Get the month
    String month = appointmentDate.getMonth().toString();

    // Convert month to title case
    String monthTitled = month.substring(0, 1).toUpperCase()
            + month.substring(1).toLowerCase();

    // Get the hour
    int hour = appointmentDate.getHour();

    // Get AM or PM
    String period;

    if (hour >= 12) {
        period = "PM";
    } else {
        period = "AM";
    }

    // Convert 24-hour time to 12-hour time
    if (hour > 12) {
        hour -= 12;
    }

    // Concatenate everything
    String whole = "You have an appointment on "
            + dayOfWk + ", "
            + monthTitled + " "
            + appointmentDate.getDayOfMonth() + ", "
            + appointmentDate.getYear()
            + ", at "
            + hour + ":"
            + String.format("%02d", appointmentDate.getMinute())
            + " "
            + period
            + ".";

    return whole;
}

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2026,9,15);
    }
}
