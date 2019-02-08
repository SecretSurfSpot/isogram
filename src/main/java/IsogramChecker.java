class IsogramChecker {

    public final boolean isIsogram(String phrase) {
      String phraseLCase = phrase.toLowerCase();
      char [] phraseLCaseArr = phraseLCase.toCharArray();
      int count = 0;

      for (int i = 0; i < phraseLCaseArr.length; i++) {
        for (int j = i + 1; j < phraseLCaseArr.length; j++) {
          if (hasSpace(phraseLCaseArr[i])) {
            break;
          }
          if (hasHyphen(phraseLCaseArr[i])) {
            break;
          }
          if (isDuplicate(phraseLCaseArr[i], phraseLCaseArr[j])) {
            count++;
            break;
          }
        }
      }

      boolean result = (count > 0) ? false : true;
      return result;
    }

    boolean isDuplicate(Character char_i, Character char_j) {
      boolean result = (char_i == char_j) ? true : false;
      return result;
    }

    boolean hasHyphen(Character char_i) {
      boolean result = (char_i == '-') ? true : false;
      return result;
    }

    boolean hasSpace(Character char_i) {
      boolean result = (char_i == ' ') ? true : false;
      return result;
    }
}
