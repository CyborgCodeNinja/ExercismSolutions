import java.util.List;
import java.util.Set;
import java.util.HashSet;
class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        //create the set
        Set<String> cardsCol = new HashSet<>();

        //iterate and then add the items to the set
        for(String card:cards){
            cardsCol.add(card);
        }

        return cardsCol;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
    boolean condition1 = !myCollection.containsAll(theirCollection);
    boolean condition2 = !theirCollection.containsAll(myCollection);

    return condition1 && condition2;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        //set to store the results
        Set<String> results = new HashSet<>(collections.get(0));

        //create the loop
        for(Set<String> collection : collections){
            results.retainAll(collection);
        }

        return results;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        //set to store the results
        Set<String> results = new HashSet<>(collections.get(0));

        //loop through the collection
        for(Set<String> collection:collections){
            results.addAll(collection);
        }

        return results;
    }
}
