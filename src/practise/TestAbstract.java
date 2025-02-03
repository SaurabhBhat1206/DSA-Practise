package practise;

public abstract class TestAbstract implements TestInterface {

     abstract void printData();

    public static void main(String[] args) {
        Business business = Business.getInstance();
        business.printDataFromInterface();
        TestInterface.loadData();
    }
}
