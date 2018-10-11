
public class RomanNumerals {
  public static int convertToInteger(String romanNum) {
    if (romanNum.length() == 0) {
      return 0;
    }
    String str = romanNum.toUpperCase();
    int lastCharCount = 0;
    char lastChar = '#';
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      if (lastChar != '#' && str.charAt(i) == lastChar) {
        lastCharCount++;
        if (repeatedTooManyTimes(lastChar, lastCharCount)) {
          return -1;
        }
      } else {
        lastCharCount = 1;
        lastChar = str.charAt(i);
      }
      if (i < str.length() - 1) {
        if (isSubtractable(str.charAt(i), str.charAt(i + 1))) {
          lastChar = str.charAt(i + 1);
          lastCharCount = 1;
          sum += getValue(str.charAt(i + 1)) - getValue(str.charAt(i));
          i++;
          continue;
        }
      }
      sum += getValue(str.charAt(i));
    }
    // To be Implemented
    return sum;
  }

  private static boolean isSubtractable(char c, char nextChar) {
    if (c != 'I' && c != 'X' && c != 'C') {
      return false;
    }
    if (getPrecedence(nextChar) <= getPrecedence(c)) {
      return false;
    }
    if (getPrecedence(nextChar) - 2 > getPrecedence(c)) {
      return false;
    }
    return true;
  }

  private static int getValue(char c) {
    switch (c) {
    case 'I':
      return 1;
    case 'V':
      return 5;
    case 'X':
      return 10;
    case 'L':
      return 50;
    case 'C':
      return 100;
    case 'D':
      return 500;
    case 'M':
      return 1000;
    }
    return 0;
  }

  private static int getPrecedence(char c) {
    switch (c) {
    case 'I':
      return 0;
    case 'V':
      return 1;
    case 'X':
      return 2;
    case 'L':
      return 3;
    case 'C':
      return 4;
    case 'D':
      return 5;
    case 'M':
      return 6;
    }
    return -1;
  }

  private static boolean repeatedTooManyTimes(char c, int count) {
    switch (c) {
    case 'I':
    case 'X':
    case 'C':
    case 'M':
      return count > 3;
    case 'V':
    case 'L':
    case 'D':
      return count > 1;
    }
    return false;
  }
}
