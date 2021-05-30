package AccessModifier.package1;

import AccessModifier.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
