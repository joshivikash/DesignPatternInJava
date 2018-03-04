package design.behavioral.observer;

public class Driver {
    public static void main(String[] args) {
        Topic dataStructureTopics = new Topic();
        Subscriber student1 = new Subscriber("Vikash");
        Subscriber student2 = new Subscriber("Kapil");
        dataStructureTopics.add(student1);
        dataStructureTopics.add(student2);

        dataStructureTopics.addNewArticle("Binary Search Tree");
        dataStructureTopics.addNewArticle("Minimum Spanning Tree");

        Topic algorithms = new Topic();
        student1 = new Subscriber("Vikash");
        algorithms.add(student1);

        algorithms.addNewArticle("Heap Sort");
    }
}
