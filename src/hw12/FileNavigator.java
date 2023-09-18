package hw12;

import java.io.File;
import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> filesListWithPath = new HashMap<>();

    public Map<String, List<FileData>> getFilesListWithPath() {
        return filesListWithPath;
    }

    public void add(FileData fileData, String path) {
        if (fileData.getPathToFile() != null && !fileData.getPathToFile().equals(path)) {
            System.out.println("File can't be added by this path. It's already saved by path " + fileData.getPathToFile());
            return;
        }
        if (filesListWithPath.size() > 0 && filesListWithPath.containsKey(path)) {
            filesListWithPath.get(path).add(fileData);
        } else {
            filesListWithPath.put(path, new ArrayList<>(Arrays.asList(fileData)));
        }
        fileData.setPathToFile(path);
    }

    public List<FileData> find(String path) {
        if (filesListWithPath.containsKey(path)) {
            for (int i = 0; i < filesListWithPath.get(path).size(); i++)
                return filesListWithPath.get(path);
        }
        return null;
    }

    public List<FileData> filterBySize(double sizeInBytes) {
        List<FileData> filteredFileList = new ArrayList<>();
        for (String key : filesListWithPath.keySet()) {
            Iterator<FileData> iterator = filesListWithPath.get(key).iterator();
            while (iterator.hasNext()) {
                FileData currentFile = iterator.next();
                if (currentFile.getSizeInBytes() <= sizeInBytes)
                    filteredFileList.add(currentFile);
            }
        }
        return filteredFileList;
    }

    public void remove(String path) {
        String removeKEY = null;
        for (String key : filesListWithPath.keySet()) {
            if (key.equals(path)) {
                removeKEY = key;
                break;
            }
        }
        filesListWithPath.remove(removeKEY);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedList = new ArrayList<>();

        for (String key : filesListWithPath.keySet()) {
            List<FileData> currentArrayOfFiles = filesListWithPath.get(key);

            for (int i = 0; i < currentArrayOfFiles.size(); i++) {
                FileData currentElement = currentArrayOfFiles.get(i);
                if (sortedList.size() == 0) {
                    sortedList.add(currentElement);
                    continue;
                }
                sortedList.add(currentElement);

                int sortedListSize = sortedList.size();
                for (int j = 0; j < sortedList.size() - 1; j++) {
                    if (Double.compare(sortedList.get(sortedListSize - 1 - j).getSizeInBytes(), sortedList.get(sortedListSize - 2 - j).getSizeInBytes()) < 0) {
                        FileData t = sortedList.get(sortedListSize - 1 - j);
                        sortedList.set(sortedListSize - 1 - j, sortedList.get(sortedListSize - 2 - j));
                        sortedList.set(sortedListSize - 2 - j, t);
                    }
                }

            }
        }
        return sortedList;
    }
}
