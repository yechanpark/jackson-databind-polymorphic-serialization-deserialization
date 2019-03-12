package complex.protocol.c.subprotocol;

import complex.protocol.c.CProtocol;

public class C2Protocol extends CProtocol {
    private String c2Field1;
    private boolean c2Field2;

    public String getC2Field1() {
        return c2Field1;
    }

    public C2Protocol setC2Field1(String c2Field1) {
        this.c2Field1 = c2Field1;
        return this;
    }

    public boolean isC2Field2() {
        return c2Field2;
    }

    public C2Protocol setC2Field2(boolean c2Field2) {
        this.c2Field2 = c2Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("c2Field1 : " + c2Field1 + ", c2Field2 = " + c2Field2);
    }
}
