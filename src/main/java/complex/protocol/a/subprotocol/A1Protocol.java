package complex.protocol.a.subprotocol;

import complex.protocol.a.AProtocol;

public class A1Protocol extends AProtocol {
    private String a1Field1;
    private String a1Field2;

    public String getA1Field1() {
        return a1Field1;
    }

    public A1Protocol setA1Field1(String a1Field1) {
        this.a1Field1 = a1Field1;
        return this;
    }

    public String getA1Field2() {
        return a1Field2;
    }

    public A1Protocol setA1Field2(String a1Field2) {
        this.a1Field2 = a1Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("a1Field1 : " + a1Field1 + ", a1Field2 = " + a1Field2);
    }
}
