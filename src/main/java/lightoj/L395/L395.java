package lightoj.L395;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L395 {
  public static void main(String[] args) {
    //
    L395 l = new L395();
    String str = "abababbdabcabc";
    var res = l.longestSubstring("aaabb", 3);
    System.out.println(res);
  }

  public int longestSubstring(String s, int k) {
    char[] str = s.toCharArray();
    return utils(str, 0, str.length, k);
  }

  public int utils(char[] str, int start, int end, int k) {
    if (end - start < k) return 0;
    int[] countMap = new int[26];
    Arrays.fill(countMap, 0);
    for (int i = start; i < end; i++) {
      countMap[str[i] - 'a']++;
    }

    for (int i = start; i < end; i++) {
      if (countMap[str[i] - 'a'] >= k) continue;

      int next = i + 1;

      while (next < end && countMap[str[next] - 'a'] < k) next++;

      int res1 = utils(str, start, i, k);
      int res2 = utils(str, next, end, k);
      return Math.max(res1, res2);
    }

    return end - start;
  }

  /**
   * Sliding window
   *
   * @param s
   * @param k
   * @return
   */
  public static int longestSubstrings(String s, int k) {
    char[] str = s.toCharArray();
    //    Set<Character> set = new HashSet<>();
    //    for (char c : str) set.add(c);
    //    int maxUnique = set.size();
    int maxUnique = findMaxUnique(str);

    int[] countMap = new int[26];
    int result = 0;
    for (int currentUnique = 1; currentUnique <= maxUnique; currentUnique++) {
      int startWindow = 0, endWindow = 0, unique = 0, countAtLeastK = 0, id = 0;
      Arrays.fill(countMap, 0);

      while (endWindow < str.length) {
        if (unique <= currentUnique) {
          id = str[endWindow] - 'a';
          if (countMap[id] == 0) unique++;
          countMap[id]++;
          if (countMap[id] == k) countAtLeastK++;
          endWindow++;
        } else {
          id = str[startWindow] - 'a';
          if (countMap[id] == k) countAtLeastK--;
          countMap[id]--;
          if (countMap[id] == 0) unique--;
          startWindow++;
        }

        if (currentUnique == unique && unique == countAtLeastK) {
          result = Math.max((endWindow - startWindow), result);
        }
      }
    }

    return result;
  }

  public static int findMaxUnique(char[] str) {
    int[] un = new int[26];
    Arrays.fill(un, 0);

    for (char c : str) {
      un[c - 'a'] = 1;
    }

    int count = 0;
    for (int n : un) {
      if (n == 1) count++;
    }

    return count;
  }
}
