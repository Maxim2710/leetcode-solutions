package Easy;

import java.util.ArrayList;
import java.util.List;

public class DesignOrderedStream {
    private int curInd;
    private String[] values;
    public DesignOrderedStream(int n) {
        curInd = 1;
        values = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        values[idKey] = value;

        List<String> result = new ArrayList<>();

        while (curInd < values.length && values[curInd] != null) {
            result.add(values[curInd]);
            curInd++;
        }

        return result;
    }
}
