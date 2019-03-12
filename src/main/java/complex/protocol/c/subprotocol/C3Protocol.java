package complex.protocol.c.subprotocol;

import complex.protocol.c.CProtocol;

public class C3Protocol extends CProtocol {
    private String c3Field1;
    private boolean c3Field2;

    public String getC3Field1() {
        return c3Field1;
    }

    public C3Protocol setC3Field1(String c3Field1) {
        this.c3Field1 = c3Field1;
        return this;
    }

    public boolean isC3Field2() {
        return c3Field2;
    }

    public C3Protocol setC3Field2(boolean c3Field2) {
        this.c3Field2 = c3Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("c3Field1 : " + c3Field1 + ", c3Field2 = " + c3Field2);
    }
}
