package hw12;

import java.io.File;

public class FileData {
    private String name;
    private double sizeInBytes;
    private String pathToFile;

    public FileData(String name, double sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public FileData(String name, double sizeInBytes, String pathToFile) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.pathToFile = pathToFile;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getName() {
        return name;
    }

    public double getSizeInBytes() {
        return sizeInBytes;
    }
}
