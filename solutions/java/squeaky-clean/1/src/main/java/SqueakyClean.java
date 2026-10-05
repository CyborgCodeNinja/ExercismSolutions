import java.lang.Character;
class SqueakyClean {
    static String clean(String identifier) {
        //convert the String to an array of characters
        char[] stringArray = identifier.toCharArray();
        boolean capitalizeNext = false;
        boolean isDigOrLet = false;
        
        //create a string builder
        StringBuilder builder = new StringBuilder();

        //Check for white spaces and replace them with underscores
        for(char c:stringArray){
            if(Character.isWhitespace(c)){
                builder.append('_');
            }else if(c=='-'){
                capitalizeNext = true;
            }else if(capitalizeNext){
                builder.append(Character.toUpperCase(c));
                capitalizeNext = false;
            }else if(Character.isDigit(c)){
                switch(c){
                    case '0':
                        builder.append('o');
                        break;
                    case '1':
                        builder.append('l');
                        break;
                    case '3':
                        builder.append('e');
                        break;
                    case '4':
                        builder.append('a');
                        break;
                    case '7':
                        builder.append('t');
                        break;
                }
            }else if(Character.isLetterOrDigit(c)){
                builder.append(c);
            }
        } 

        return builder.toString();
    }
}
