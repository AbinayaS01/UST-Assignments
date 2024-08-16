package strings;


import java.util.ArrayList;

public class Distinct_sequence{
    public static void main(String[] args) {
        String input = "var";
        ArrayList<String> subsequences = new ArrayList<>();
        generateSubsequences(input, "", subsequences);
        
        ArrayList<String> allPermutations = new ArrayList<>();
        for (String subseq : subsequences) {
            generatePermutations(subseq, "", allPermutations);
        }

       
        System.out.println("Distinct subsequences: " + allPermutations);
        System.out.println("Count: " + allPermutations.size());
    }

    public static void generateSubsequences(String s, String current, ArrayList<String> subsequences) {
        if (current.length() > 0) {
            subsequences.add(current);
        }

        for (int i = 0; i < s.length(); i++) {
            generateSubsequences(s.substring(i + 1), current + s.charAt(i), subsequences);
        }
    }

    public static void generatePermutations(String str, String perm, ArrayList<String> results) {
        if (str.isEmpty()) {
            results.add(perm);
        } else {
            for (int i = 0; i < str.length(); i++) {
                generatePermutations(str.substring(0, i) + str.substring(i + 1), perm + str.charAt(i), results);
            }
        }
    }
}