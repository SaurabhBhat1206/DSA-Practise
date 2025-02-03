package practise;

public class Business implements TestInterface{
    private static Business instance = null;
    private Business() {}
    public static Business getInstance(){
        if(instance==null)
            instance = new Business();
        return instance;
    }

    @Override
    public void printDataFromInterface() {
        System.out.println("Hello !!");
    }
}
