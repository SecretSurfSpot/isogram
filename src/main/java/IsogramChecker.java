class IsogramChecker {

    public final boolean isIsogram(String phrase) {
      String phraseLCase = phrase.toLowerCase();
      char [] phraseLCaseArr = phraseLCase.toCharArray();
      int count = 0;
      System.out.println("phrase is: " + phraseLCaseArr);
      System.out.println(phraseLCaseArr);

      for (int i = 0; i < phraseLCaseArr.length; i++) {
        for (int j = i + 1; j < phraseLCaseArr.length; j++) {
          if (isDuplicate(phraseLCaseArr[i], phraseLCaseArr[j])) {
            count++;
            break;
          }
        }
      }
      if (count > 0) {
        return false;
      } else {
        return true;
      }
    }

    boolean isDuplicate(Character char_i, Character char_j) {
      boolean result = (char_i == char_j) ? true : false;
      return result;
    }
}
