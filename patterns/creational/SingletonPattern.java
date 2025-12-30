package patterns.creational;
class Single {
    // static class
    private static Single instance;
    
    private Single()
    {
        System.out.println("Singleton is Instantiated.");
    }
    public static Single getInstance()
    {
        if (instance == null)
            instance = new Single();
        return instance;
    }
    public static void doSomething()
    {
        System.out.println("Something is Done.");
    }
}

public class SingletonPattern {
    public static void main(String[] args)
    {
        Single.getInstance().doSomething();
    }
}