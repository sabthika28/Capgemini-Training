package JDBC;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

public class nio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();

        Path dir = Paths.get(dirPath);

        if (!Files.isDirectory(dir)) {
            System.out.println("Invalid directory!");
            return;
        }

        List<String> allFiles = new ArrayList<>();
        Map<String, Integer> fileTypeCount = new HashMap<>();

        try {
            // Walk through the directory
            Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (Files.isRegularFile(file)) {
                        allFiles.add(file.getFileName().toString());

                        String fileName = file.getFileName().toString();
                        String extension = "";

                        int dotIndex = fileName.lastIndexOf('.');
                        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                            extension = fileName.substring(dotIndex + 1).toLowerCase();
                        } else {
                            extension = "no_extension";
                        }

                        fileTypeCount.put(extension, fileTypeCount.getOrDefault(extension, 0) + 1);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            // Write all filenames to one file
            Path allFilesOutput = Paths.get("all_files.txt");
            Files.write(allFilesOutput, allFiles);
            System.out.println("File names written to all_files.txt");

            // Write file type counts to another file
            Path typeCountOutput = Paths.get("file_type_count.txt");
            List<String> typeCountLines = fileTypeCount.entrySet().stream()
                    .map(e -> e.getKey() + ": " + e.getValue())
                    .collect(Collectors.toList());
            Files.write(typeCountOutput, typeCountLines);
            System.out.println("File type counts written to file_type_count.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
