package test;

public class Prime {
  public static void main(String[] args) {
    //
    System.out.println(reverseVowels("hello"));
  }

  public static String reverseVowels(String s) {
    char[] wordArray = s.trim().toCharArray();
    int firstIndex = 0;
    int lastIndex = s.length() - 1;
    while (firstIndex <= lastIndex) {
      char firstchar = wordArray[firstIndex];
      char lastchar = wordArray[lastIndex];
      if (isVowel(firstchar) && isVowel(lastchar)) {
        wordArray[firstIndex] = lastchar;
        wordArray[lastIndex] = firstchar;
        firstIndex++;
        lastIndex--;
      } else if (!isVowel(firstchar) && isVowel(lastchar)) {
        firstIndex++;
      } else if (isVowel(firstchar) && !isVowel(lastchar)) {
        lastIndex--;
      } else {
        firstIndex++;
        lastIndex--;
      }
    }
    return String.valueOf(wordArray);
  }

  public static boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
        || c == 'I' || c == 'O' || c == 'U');
  }
}
