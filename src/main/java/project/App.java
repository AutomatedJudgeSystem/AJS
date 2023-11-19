package project;

//import java.util.logging.FileHandler;
import project.factory.FileHandler;
import project.factory.FileHandlerFactory;
import project.factory.ZipFileHandlerFactory;

public class App {
    public static void main( String[] args ) {
        FileHandlerFactory fileHandlerFactory = new ZipFileHandlerFactory();
        FileHandler fileHandler = fileHandlerFactory.createFileHandler();

        String zipFilePath = "files/submissions.zip";
        fileHandler.handleFile(zipFilePath);
    }
}