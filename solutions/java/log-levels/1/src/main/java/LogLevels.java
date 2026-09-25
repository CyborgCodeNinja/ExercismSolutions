public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfColon = logLine.indexOf(":");
        String messToReturn = logLine.substring(indexOfColon + 1);
        return messToReturn.trim();
    }

    public static String logLevel(String logLine) {
        String[] words = logLine.split(":");
        String level = words[0];
        String messageToReturn = level.substring(1,level.length() - 1);
        return messageToReturn.toLowerCase();
    }

    public static String reformat(String logLine) {
        String words[] = logLine.split(":");
        String level = words[0];
        String message = words[1];
        
        //remove [ and ]
        level = level.replace("[","");
        level = level.replace("]","");

        //To lower case
        level = level.toLowerCase();
        
        //remove the white spaces
        message = message.trim();

        //return the message
        return message + " ("+level+")";
    
    }
}
