package kz.hunt;

import java.util.List;

public class UserInputData {
    private final String[] ids;
    private final String[] names;
    private final int[] counts;
    private final int[] weights;

    public UserInputData(List<String> userInput) {
        int size = userInput.size();
        this.ids = new String[size];
        this.names = new String[size];
        this.counts = new int[size];
        this.weights = new int[size];

        for (int i = 0; i < userInput.size(); i++) {
            String data = userInput.get(i);
            String[] fields = data.split(" ");
            ids[i] = fields[0].trim();
            names[i] = fields[1].trim();
            counts[i] = Integer.parseInt(fields[2].trim());
            weights[i] = Integer.parseInt(fields[3].trim());
        }
    }

    public String[] getIds() {
        return ids;
    }

    public String[] getNames() {
        return names;
    }

    public int[] getCounts() {
        return counts;
    }

    public int[] getWeights() {
        return weights;
    }
}
