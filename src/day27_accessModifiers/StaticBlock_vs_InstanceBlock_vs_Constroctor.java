package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constroctor {

    public StaticBlock_vs_InstanceBlock_vs_Constroctor(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");          // only one time execute
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constroctor();
        new StaticBlock_vs_InstanceBlock_vs_Constroctor();


    }
}
