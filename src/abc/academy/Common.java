package abc.academy;

/**
 * Created by balajakka on 18/01/2019.
 */
public class Common{
    public int publicInt = 1;
    protected int protectedInt = 2;
    int defaultInt = 3;
    private int privateInt = 4;

    public void printPublic(){
        System.out.println("I am in Public");
    }
    private void printPrivate(){
        System.out.println("I am in Private");
    }
    protected void printProtected(){
        System.out.println("I am in Protected");
    }
    void printDefault(){
        System.out.println("I am in Default");
    }
}
