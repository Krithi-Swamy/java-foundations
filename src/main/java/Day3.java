public class Day3 {
    public static void main(String[] args) {
        //Program 3
        int[] arr = {10, 20, 30, 40, 50};
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int item : arr){
            System.out.println(item);
        }

        //Program 4 + 6
        String original = " A, man a plan,   a  canal , Panama ?????  ";
        original = original.toLowerCase();
        original = original.trim();
        original = original.replaceAll("[^a-zA-Z]", "");
        String[] conversion = original.split("\\s+");
        String original2 = String.join("", conversion);
        System.out.println(original2);
        char[] array = original2.toCharArray();
        int x = 0;
        int y = array.length - 1;
        while(x < y){
            char temp = array[x];
            array[x] = array[y];
            array[y] = temp;
            x++;
            y--;
        }
        String reverse = String.copyValueOf(array);
        if(original2.equals(reverse)){
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's NOT a palindrome");
        }

        //Program 5
        String sentence = "  Hello   world  ";
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
