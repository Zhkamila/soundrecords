import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void createDirectories(String path) {
        File docsDir = new File(path + "/document");
        File textDir = new File(path + "/text");
        File lyricDir = new File(path + "/lyric");
        docsDir.mkdir();
        textDir.mkdir();
        lyricDir.mkdir();
    }

    public static void createFiles(String path, String dirName) {
        File document = new File(path + "/" + dirName + "_important.txt");
        File text = new File(path + "/" + dirName + "_text.txt");
        File lyrics = new File(path + "/" + dirName + "_lyrics.txt");
        try {
            document.createNewFile();
            text.createNewFile();
            lyrics.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeFileStructure(String path, File directory) {
        File fileStructure = new File(path + "/fileStructure.txt");
        try {
            fileStructure.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fileStructureWrite = new FileWriter(path + "/fileStructure.txt");
            fileStructureWrite.write(directory.getName());
            for (File dir : directory.listFiles(f -> f.isDirectory())) {
                fileStructureWrite.write("\n|");
                fileStructureWrite.write("\n|-----" + dir.getName());
                for (File file : dir.listFiles()) {
                    fileStructureWrite.write("\n|     " + file.getName());
                }
            }
            fileStructureWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = args[0];
        File directory = new File(path);
        if (!directory.isDirectory()) {
            System.out.println("Directory is created!");
            directory.mkdir();
        }
        System.out.println("New folders created in Directory!");
        createDirectories(path);
        System.out.println("New files created in subdirectories");
        for (File dir : directory.listFiles(e -> e.isDirectory())) {
            createFiles(path + "/" + dir.getName(), dir.getName());
        }
        System.out.println("fileStructure.txt is created to show the structure");
        makeFileStructure(path, directory);
    }
}
