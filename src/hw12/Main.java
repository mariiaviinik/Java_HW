package hw12;

public class Main {
    public static void main(String[] args) {
        FileData file = new FileData("file.txt", 1300);
        FileData file2 = new FileData("second.txt", 1200);
        FileData file3 = new FileData("third.txt", 990);
        FileData file4 = new FileData("forth.txt", 590);
        FileData file5 = new FileData("forth.txt", 300);

        final String PATH1 = "path/number/1";
        final String PATH2 = "path/number/2";
        final String PATH3 = "path/number/3";

        FileNavigator fileNavigator = new FileNavigator();

        fileNavigator.add(file, PATH1);
        fileNavigator.add(file2, PATH1);
        fileNavigator.add(file3, PATH2);
        fileNavigator.add(file4, PATH3);
        fileNavigator.add(file5, PATH3);

        fileNavigator.add(file2, PATH3);

        System.out.println("Files by " + PATH1 + ": " + fileNavigator.find(PATH1));
        System.out.println("Files by " + PATH2 + ": " + fileNavigator.find(PATH2));
        System.out.println("Files by " + PATH3 + ": " + fileNavigator.find(PATH3));

        System.out.println("Files with size less than 1100: " + fileNavigator.filterBySize(1100));

        System.out.println(fileNavigator.sortBySize());

        fileNavigator.remove(PATH1);
        fileNavigator.remove("Path that doesn't exist");

        System.out.println("FileNavigator after removing: " + fileNavigator.getFilesListWithPath());
    }
}
