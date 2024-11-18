import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;



public class SearchSuggestions {
    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

        List<List<String>> returnSuggestions = new ArrayList<>();


        if(repository.isEmpty() || customerQuery.isEmpty()) return returnSuggestions;

        List<String> sortedRepository = new ArrayList<>();
        for(var word : repository) {
            sortedRepository.add(word.toLowerCase());
        }
        Collections.sort(sortedRepository);


        for(int i = 2; i <= customerQuery.length(); i++) {
            String searchWord = customerQuery.substring(0, i );

            List<String> suggestions = new ArrayList<>();
            for(String word : sortedRepository) {
                if(word.startsWith(searchWord) && suggestions.size() < 3) {
                    suggestions.add(word);
                }
            }
            if(!suggestions.isEmpty())
                returnSuggestions.add(suggestions);
        }


        return returnSuggestions;
    }


    public static void main(String[] args) {
        List<String> repository = new ArrayList<>();
        repository.add("mobile");
        repository.add("mouse");
        repository.add("moneypot");
        repository.add("monitor");
        repository.add("mousepad");


        var result = searchSuggestions(repository, "kat");
        System.out.println(result);
    }
}
