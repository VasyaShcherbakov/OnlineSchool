package OnLIneScool.entyty;


import java.io.*;

    public class CreateLogFile {

        public static void main(String[] args) {
            String folder = "DEBUG/INFO/WARNING/ERROR/OFF/";
            String level = "INFO";
            String fileName = folder + "logging.txt";

            File file = new File(fileName);
            if (!file.exists()) {
                try {
                    new File(folder).mkdirs();
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("level=" + level);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
