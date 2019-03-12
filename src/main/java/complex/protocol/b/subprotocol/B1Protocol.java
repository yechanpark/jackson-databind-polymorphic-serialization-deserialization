package complex.protocol.b.subprotocol;

import complex.protocol.b.BProtocol;

public class B1Protocol extends BProtocol {
    private String b1Field1;
    private String b1Field2;
    private int b1Field3;

    public String getB1Field1() {
        return b1Field1;
    }

    public B1Protocol setB1Field1(String b1Field1) {
        this.b1Field1 = b1Field1;
        return this;
    }

    public String getB1Field2() {
        return b1Field2;
    }

    public B1Protocol setB1Field2(String b1Field2) {
        this.b1Field2 = b1Field2;
        return this;
    }

    public int getB1Field3() {
        return b1Field3;
    }

    public B1Protocol setB1Field3(int b1Field3) {
        this.b1Field3 = b1Field3;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("b1Field1 : " + b1Field1 + ", b1Field2 = " + b1Field2 + ", b1Field3 = " + b1Field3);
    }
}