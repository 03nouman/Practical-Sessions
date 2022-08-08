public class stringCount {
    public static void main(String[] args) {
        int Count_v = 0;
        int Count_c = 0;
        String str = "The movie is really good";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                Count_v++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                Count_c++;
            }
        }
        System.out.println("Number of vowels: " + Count_v);
        System.out.println("Number of consonants: " + Count_c);

    }
}
