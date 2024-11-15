public class ParenthesisValidator {

    public boolean isValid(String s) {
        int openCount = 0, starCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount > 0) {
                    openCount--;
                } else if (starCount > 0) {
                    starCount--;
                } else {
                    return false;  // No matching '(' or '*' to act as ')'
                }
            } else if (ch == '*') {
                starCount++;  // Count '*' as potential balancing character
            } else if (ch == '$') {
                continue;  // Ignore the end marker
            }
        }

        // Check if wildcards '*' are enough to balance remaining '('
        return openCount == 0 || starCount >= openCount;
    }
}
