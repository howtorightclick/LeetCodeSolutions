import java.util.stream.Collectors;

class Solution {
    public List<String> commonChars(String[] words) {

        Set<Char> allCharList = new HashSet<>();
        Set<Char> dupChars = new HashSet<>();
        List<Set<Char>> allWordChars = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Set<Char> wordChars = words[i].chars().mapToObj(
                e -> (char)e
            ).collect(Collectors.toSet());
            allWordCahrs.add(wordChars);
            allCharList.addall(wordChars);
        }

        

    }
}
