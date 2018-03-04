package design.behavioral.visitor;

public class Driver {
    public static void main(String[] args) {
        Directory dir = new Directory("home");
        Directory dir2 = new Directory("Vikash");
        dir.add(dir2);
        File file1 = new File("file1.txt");
        dir2.add(file1);
        dir.add(new File(".bashrc"));

        dir.copy();
    }
}
