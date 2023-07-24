package kz.hunt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterService {

    public void writeToFile(List<Toy> toys) {
        try (FileWriter fileWriter = new FileWriter("result.txt")){
            for (Toy toy : toys) {
                fileWriter.write("ID: " + toy.getId() + ", Name: " + toy.getName() + "\n");
            }
            fileWriter.close();
            System.out.println("Результаты розыгрыша записаны в файл result.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

}
