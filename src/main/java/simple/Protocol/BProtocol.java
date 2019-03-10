package simple.Protocol;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "bfield1", "bfield2", "bfield3" })
public class BProtocol implements Protocol {
    private String bProtocolField1;
    private String bProtocolField2;
    private String bProtocolField3;

    public String getBField1() {
        return this.bProtocolField1;
    }

    public String getBField2() {
        return this.bProtocolField2;
    }

    public String getBField3() {
        return this.bProtocolField3;
    }

    public BProtocol setBField1(String bProtocolField1) {
        this.bProtocolField1 = bProtocolField1;
        return this;
    }

    public BProtocol setBField2(String bProtocolField2) {
        this.bProtocolField2 = bProtocolField2;
        return this;
    }

    public BProtocol setBField3(String bProtocolField3) {
        this.bProtocolField3 = bProtocolField3;
        return this;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute()");
        System.out.println("bProtocolField1 = " + bProtocolField1);
        System.out.println("bProtocolField2 = " + bProtocolField2);
        System.out.println("bProtocolField3 = " + bProtocolField3);
    }
}