package Easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> cities1 = new HashSet<>();

        for (List<String> path : paths) {
            cities1.add(path.getFirst());
        }

        for (List<String> path : paths) {
            String cur = path.get(1);
            if (!cities1.contains(cur)) {
                return cur;
            }
        }

        return "";
    }
}
