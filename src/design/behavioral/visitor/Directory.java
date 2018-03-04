package design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    public Directory(String name) {
        super(name);
        isDirectory = true;
        // TODO Auto-generated constructor stub
    }

    private List<File>       files            = new ArrayList<>();
    private DirectoryVisitor directoryVisitor = new DirectoryVisitor();

    public void add(File file) {
        files.add(file);
    }

    @Override
    protected void copy() {
        directoryVisitor.visit(this);
    }

    public List<File> getFiles() {
        return files;
    }
}
