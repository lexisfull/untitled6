public class Main {
    public static void main(String[] args) {
        CollectionEx<String> collection = new CollectionEx<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");
        collection.add("F");
        System.out.println(collection);
        System.out.println("-------------");
        System.out.println();
        collection.delete(3);
        System.out.println(collection);
    }
}