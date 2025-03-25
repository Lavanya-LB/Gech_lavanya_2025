package inheritence;

interface Interface1 {
    public void interface1Method();
}

interface Interface2 {
    public void interface2Method1();
}

interface Interface13 extends Interface1, Interface2 {
    public void interface13Method1();
}

class ParentI implements Interface13 {
    @Override
    public void interface1Method() {
        System.out.println("Interface Method");
    }

    @Override
    public void interface2Method1() {
        System.out.println(" second interface method");
    }

    @Override
    public void interface13Method1() {
        System.out.println(" third interface method");
    }

    public void parentIMethod() {
        System.out.println(" parent method");
    }
}

class ChildI1 extends ParentI {
    public void childI1Method() {
        System.out.println(" child1 method");
    }
}

class ChildI2 extends ParentI {
    public void childI2Method() {
        System.out.println(" child2 method");
    }
}

public class Assignment2in {
	
	public static void main(String[] args) {
        ChildI1 child1 = new ChildI1();
        child1.parentIMethod();
        child1.interface1Method();
        child1.interface2Method1();
        child1.interface13Method1();
        child1.childI1Method();

        ChildI2 child2 = new ChildI2();
        child2.parentIMethod();
        child2.interface1Method();
        child2.interface2Method1();
        child2.interface13Method1();
        child2.childI2Method();
    }

}
