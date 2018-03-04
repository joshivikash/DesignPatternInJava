package design.behavioral.visitor;

public class File {
    protected boolean   isDirectory;
    private FileVisitor fileVisitor = new FileVisitor();
    private String      name;

    public File(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public void setDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    protected void copy() {
        fileVisitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
