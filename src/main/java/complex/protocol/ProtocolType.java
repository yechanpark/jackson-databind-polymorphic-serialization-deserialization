package complex.protocol;

import complex.protocol.a.AProtocol;
import complex.protocol.b.BProtocol;
import complex.protocol.c.CProtocol;

public enum ProtocolType {
    A(AProtocol.class),
    B(BProtocol.class),
    C(CProtocol.class);

    private Class clazz;

    ProtocolType(Class clazz) {
        this.clazz = clazz;
    }

    public Class getProtocolType() {
        return this.clazz;
    }
}