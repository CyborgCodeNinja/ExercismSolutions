import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean hasSome = false;
        if(languages.size()==0){
            hasSome = true;
        }
        return hasSome;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
       languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
       boolean heDoes = false;
        if(languages.contains("Java")||languages.contains("Kotlin")){
            heDoes = true;
        }
        return heDoes;
    }
}
