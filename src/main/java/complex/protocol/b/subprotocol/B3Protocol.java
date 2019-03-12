package complex.protocol.b.subprotocol;

import complex.protocol.b.BProtocol;

public class B3Protocol extends BProtocol {
    private String b3Field1;

    public String getB3Field1() {
        return b3Field1;
    }

    public B3Protocol setB3Field1(String b3Field1) {
        this.b3Field1 = b3Field1;
        return this;
    }

    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("b3Field1 : " + b3Field1);
    }
}
