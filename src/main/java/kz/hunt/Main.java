package kz.hunt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Sample of input data:
        // 1 ball 1 20
        UserInputData inputData = new UserInputData(readUserInput());
        ToyLottery toyLottery = new ToyLottery(inputData);
        List<Toy> winToys = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Toy toy = toyLottery.getToy();
            if (toy != null) {
                winToys.add(toy);
            }
        }

        FileWriterService fileWriterService = new FileWriterService();
        fileWriterService.writeToFile(winToys);
    }

    public static List<String> readUserInput() {
        List<String> userData = new ArrayList<>();
        System.out.println("Please enter your data below: (send 'bye' to exit) ");
        Scanner input = new Scanner(System.in);
        while (true) {
            String line = input.nextLine();
            if ("bye".equalsIgnoreCase(line)) {
                break;
            }
            userData.add(line);
        }
        return userData;
    }
}