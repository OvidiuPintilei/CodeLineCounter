import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpeedMode {
    LineProcessor lineProcessor;

    SpeedMode(LineProcessor lineProcessor)
    {
        this.lineProcessor = lineProcessor;
    }

    void makeItFast(String filePath) {
        try {
            int numberOfLines = 0;
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null){
                if (lineProcessor.isComment(line)) {
                    continue;
                }
                System.out.println(line);
                numberOfLines++;
            }
            System.out.println("\nLines: " + numberOfLines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
