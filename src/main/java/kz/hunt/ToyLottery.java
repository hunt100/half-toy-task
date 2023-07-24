package kz.hunt;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToyLottery {
    private final Queue<Toy> toyQueue;

    public ToyLottery(UserInputData userData) {
        if (userData.getIds().length != userData.getNames().length
                || userData.getIds().length != userData.getCounts().length
                || userData.getIds().length != userData.getWeights().length) {
            throw new IllegalArgumentException("Arrays content is different, all arrays must be the same size");
        }

        this.toyQueue = new PriorityQueue<>((t1, t2) -> t2.getWeight() - t1.getWeight());

        for (int i = 0; i < userData.getIds().length; i++) {
            String id = userData.getIds()[i].trim();
            String name = userData.getNames()[i].trim();
            int count = userData.getCounts()[i];
            int weight = userData.getWeights()[i];
            for (int j = 0; j < count; j++) {
                Toy toy = new Toy(id, name, weight);
                toyQueue.offer(toy);
            }
        }
    }

    public Toy getToy() {
        return toyQueue.poll();
    }

}
