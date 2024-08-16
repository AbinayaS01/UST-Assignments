package strings;

public class Reverse {
    public static void main(String[] args) {
        String input = "i love programming very much";
        char[] str = input.toCharArray();
        String result = "";
        reverseArray(str, 0, str.length - 1);
        int start = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1 || str[i] == ' ') {
                int end = (i == str.length - 1) ? i : i - 1;
                reverseArray(str, start, end); 
                start = i + 1;
            }
        }

        
        for (int i = 0; i < str.length; i++) {
            result += str[i];
        }

        System.out.println(result); 
    }
    private static void reverseArray(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}