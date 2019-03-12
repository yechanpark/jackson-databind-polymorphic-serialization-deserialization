package complex.protocol.c.subprotocol;

import complex.protocol.c.CProtocol;

public class C1Protocol extends CProtocol {
    private String c1Field1;
    private String c1Field2;

    public String getC1Field1() {
        return c1Field1;
    }

    public C1Protocol setC1Field1(String c1Field1) {
        this.c1Field1 = c1Field1;
        return this;
    }

    public String getC1Field2() {
        return c1Field2;
    }

    public C1Protocol setC1Field2(String c1Field2) {
        this.c1Field2 = c1Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("c1Field1 : " + c1Field1 + ", c1Field2 = " + c1Field2);
    }
}