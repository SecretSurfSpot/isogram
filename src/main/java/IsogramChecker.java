class IsogramChecker {

    public final boolean isIsogram(String phrase) {
      String phraseLCase = phrase.toLowerCase();
      char [] phraseLCaseArr = phraseLCase.toCharArray();
      int count = 0;
      System.out.println("phrase is: " + phraseLCaseArr);
      System.out.println(phraseLCaseArr);

      for (int i = 0; i < phraseLCaseArr.length; i++) {
        System.out.println("word is: " + phraseLCase);
        for (int j = i + 1; j < phraseLCaseArr.length; j++) {

          if (hasSpace(phraseLCaseArr[i])) {
            System.out.println("char is: " + phraseLCaseArr[i]);
            break;
          }

          if (hasHyphen(phraseLCaseArr[i])) {
            System.out.println("char is: " + phraseLCaseArr[i]);
            break;
          }

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

    boolean hasHyphen(Character char_i) {
      boolean result = (char_i == '-') ? true : false;
      return result;
    }

    boolean hasSpace(Character char_i) {
      boolean result = (char_i == ' ') ? true : false;
      return result;
    }
}
