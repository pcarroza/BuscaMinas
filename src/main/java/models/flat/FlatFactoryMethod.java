package main.java.models.flat;

public abstract class FlatFactoryMethod {

    private static FlatFactoryMethod flatFactoryMethod;

    public static FlatFactoryMethod getInstance() {
        if (flatFactoryMethod == null) {
            String line = getSingletonFactory();
            flatFactoryMethod = new HashFactory();
        }
        return flatFactoryMethod;
    }

    private static String getSingletonFactory() {
        /*String line = null;
        try {
            //line = new BufferedReader(new FileReader("src/main/resources/Singe"))
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        return null;
    }

    protected Flat flat;

    public Flat getFlat() {
        return this.flat;
    }
}
