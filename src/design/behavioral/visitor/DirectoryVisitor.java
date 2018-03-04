package design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class DirectoryVisitor implements Visitor<Directory> {

    @Override
    public void visit(Directory dir) {
        System.out.println("Creating directory \"" + dir.getName() + "\"");
        List<File> filesAndDirs = dir.getFiles();
        List<File> dirs = new ArrayList<>();
        List<File> files = new ArrayList<>();
        for (File file : filesAndDirs) {
            if (file.isDirectory) {
                dirs.add(file);
            } else {
                files.add(file);
            }
        }
        if (!files.isEmpty()) {
            System.out.println("########### Copying files under \"" + dir.getName() + "\" ###################");
            for (File file : files) {
                file.copy();
            }
        }
        if (!dirs.isEmpty()) {
            System.out.println(
                    "*************** Creating directories under \"" + dir.getName() + "\" ***************************");
            for (File file : dirs) {
                file.copy();
            }
        }
    }

}
