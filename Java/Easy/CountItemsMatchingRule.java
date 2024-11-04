package Easy;

import java.util.List;
import java.util.Objects;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int controlKey = 0;
        int cntMatches = 0;
        switch (ruleKey) {
            case "type":
                break;

            case "color":
                controlKey = 1;
                break;

            case "name":
                controlKey = 2;
                break;

            default:
                return 0;
        }

        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(items.get(i).get(controlKey), ruleValue)) {
                cntMatches++;
            }
        }

        return cntMatches;
    }
}
