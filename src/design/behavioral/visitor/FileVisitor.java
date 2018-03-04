package design.behavioral.visitor;

public class FileVisitor implements Visitor<File> {

    @Override
    public void visit(File file) {
        System.out.println("Copying file \"" + file.getName() + "\"");
    }

}
