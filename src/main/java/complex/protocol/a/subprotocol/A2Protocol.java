package complex.protocol.a.subprotocol;

import complex.protocol.a.AProtocol;

public class A2Protocol extends AProtocol {
    private String a2Field1;
    private String a2Field2;

    public String getA2Field1() {
        return a2Field1;
    }

    public A2Protocol setA2Field1(String a2Field1) {
        this.a2Field1 = a2Field1;
        return this;
    }

    public String getA2Field2() {
        return a2Field2;
    }

    public A2Protocol setA2Field2(String a2Field2) {
        this.a2Field2 = a2Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("a2Field1 : " + a2Field1 + ", a2Field2 = " + a2Field2);
    }
}

