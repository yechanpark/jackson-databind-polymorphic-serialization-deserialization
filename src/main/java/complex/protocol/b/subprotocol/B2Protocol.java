package complex.protocol.b.subprotocol;

import complex.protocol.b.BProtocol;

public class B2Protocol extends BProtocol {
    private String b2Field1;
    private int b2Field2;

    public String getB2Field1() {
        return b2Field1;
    }

    public B2Protocol setB2Field1(String b2Field1) {
        this.b2Field1 = b2Field1;
        return this;
    }

    public int getB2Field2() {
        return b2Field2;
    }

    public B2Protocol setB2Field2(int b2Field2) {
        this.b2Field2 = b2Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("b2Field1 : " + b2Field1 + ", b2Field2 = " + b2Field2);
    }
}
