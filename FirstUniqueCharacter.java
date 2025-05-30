import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstUniqueChar(input);

        if (result != 0) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstUniqueChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
