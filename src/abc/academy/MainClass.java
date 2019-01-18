package abc.academy;

import abc.DifferentClass;
import anotherPackage.AnotherCommon;
import anotherPackage.Subclass;

/**
 * Created by balajakka on 18/01/2019.
 */
public class MainClass {

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
    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        mainClass.printPublic();
        mainClass.printProtected();
        mainClass.printPrivate();
        mainClass.printDefault();

        System.out.println(mainClass.publicInt);
        System.out.println(mainClass.protectedInt);
        System.out.println(mainClass.defaultInt);
        System.out.println(mainClass.privateInt);

        Common common = new Common();

        common.printPublic();
        common.printProtected();
        common.printDefault();
        common.printPrivate();

        System.out.println(common.publicInt);
        System.out.println(common.protectedInt);
        System.out.println(common.defaultInt);
        System.out.println(common.privateInt);

        Subclass subclass = new Subclass();
        subclass.printPublic();
        subclass.printProtected();
        subclass.printDefault();

        System.out.println(subclass.publicInt);
        System.out.println(subclass.protectedInt);
        System.out.println(subclass.defaultInt);
        System.out.println(subclass.privateInt);

        AnotherCommon anotherCommon = new AnotherCommon();
        anotherCommon.printPublic();
        System.out.println(anotherCommon.publicInt);

        DifferentClass differentClass = new DifferentClass();
        differentClass.printPublic();
        System.out.println(differentClass.publicInt);


    }
}
