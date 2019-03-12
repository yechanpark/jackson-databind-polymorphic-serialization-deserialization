package complex.protocol.b.subprotocol;

import complex.protocol.b.BProtocol;

public class B4Protocol extends BProtocol {
    private String b4Field1;
    private int b4Field2;

    public String getB4Field1() {
        return b4Field1;
    }

    public B4Protocol setB4Field1(String b4Field1) {
        this.b4Field1 = b4Field1;
        return this;
    }

    public int getB4Field2() {
        return b4Field2;
    }

    public B4Protocol setB4Field2(int b4Field2) {
        this.b4Field2 = b4Field2;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("b4Field1 : " + b4Field1 + ", b4Field2 = " + b4Field2);
    }
}
