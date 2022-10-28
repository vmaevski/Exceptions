package HW_S03;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void setList(String[] l) {
        String[] list = l;
        String text = "";
        String fileName = list[0] + ".txt";
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                text += list[i];
            } else {
                text += " " + list[i];
            }
        }
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
