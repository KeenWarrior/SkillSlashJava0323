package lecture2;

public class StringBuilderExample {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder(line);
//
//        sb.append(" overall");
//
//        System.out.println(sb);

//        System.out.println((int)'B');
        System.out.println(removeVowels("data"));
    }

//    public static String toUpperCase(String input){
//        String result = "";
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if ((ch >= 'a') && (ch <= 'z')){
//                ch = (char)('A' + (ch - 'a'));
//            }
//            result = result + ch;
//        }
//
//        return result;
//    }

    public static String toUpperCase(String input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a') && (ch <= 'z')){
                ch = (char)('A' + (ch - 'a'));
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static String removeVowels(String input){
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!vowels.contains(""+ch)){
                result.append(ch);
            }

        }

        return result.toString();
    }
}
