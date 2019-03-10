package simple.Protocol;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "cfield1", "cfield2", "cfield3", "cfield4" })
public class CProtocol implements Protocol {
    private String cProtocolField1;
    private String cProtocolField2;
    private String cProtocolField3;
    private String cProtocolField4;

    public String getCField1() {
        return cProtocolField1;
    }

    public String getCField2() {
        return cProtocolField2;
    }

    public String getCField3() {
        return cProtocolField3;
    }

    public String getCField4() {
        return cProtocolField4;
    }

    public CProtocol setCField1(String cProtocolField1) {
        this.cProtocolField1 = cProtocolField1;
        return this;
    }

    public CProtocol setCField2(String cProtocolField2) {
        this.cProtocolField2 = cProtocolField2;
        return this;
    }

    public CProtocol setCField3(String cProtocolField3) {
        this.cProtocolField3 = cProtocolField3;
        return this;
    }

    public CProtocol setCField4(String cProtocolField4) {
        this.cProtocolField4 = cProtocolField4;
        return this;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute()");
        System.out.println("cProtocolField1 = " + cProtocolField1);
        System.out.println("cProtocolField2 = " + cProtocolField2);
        System.out.println("cProtocolField3 = " + cProtocolField3);
        System.out.println("cProtocolField4 = " + cProtocolField4);
    }
}