class IsogramChecker {

    boolean isIsogram(String phrase) {
      char [] phraseCharArray = phrase.toCharArray();
      int count = 0;
      System.out.println("phrase is: " + phraseCharArray);
      System.out.println(phraseCharArray);

      for (int i = 0; i < phraseCharArray.length; i++) {
        for (int j = i + 1; j < phraseCharArray.length; j++) {
          if (isDuplicate(phraseCharArray[i], phraseCharArray[j])) {
            count++;
            break;
          }
        }
      }
      if (count > 0) {
        return true;
      } else {
          return false;
      }
    }

    boolean isDuplicate(Character char_i, Character char_j) {
      boolean result = (char_i == char_j) ? true : false;
      return result;
    }
}
