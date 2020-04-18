import contracts.Removable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class ReadableMode {
    LineProcessor lineProcessor;

    ReadableMode(LineProcessor lineProcessor) {
        this.lineProcessor = lineProcessor;
    }

    void makeItReadable(String filePath) {
        int numberOfLines = 0;
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(filePath));
            for (String line : fileLines) {
                line = line.trim();
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
