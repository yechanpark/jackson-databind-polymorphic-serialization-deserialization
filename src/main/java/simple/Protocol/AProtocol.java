package simple.Protocol;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "afield1", "afield2" })
public class AProtocol implements Protocol {
    // 필드를 직접 출력하려면 public 필드로 선언해야 한다.
    private String aProtocolField1;
    private String aProtocolField2;

    // 출력하려는 필드를 private으로 선언했다면, public getter가 있어야 한다.
    // 이때, Serializae 시 getXXXX에서 XXXX가 key이며, 필드의 값이 value가 된다.
    public String getAField1() {
        return aProtocolField1;
    }

    public String getAField2() {
        return aProtocolField2;
    }
    // 입력하려는 필드를 private으로 선언했다면, public setter가 있어야 한다.
    // 이때, Deserializae 시 "XXXX":"1" 이라는 json node가 있다면 setXXXX를 설정해줘야 제대로 1이라는 값이 필드의 값으로 들어간다.
    public AProtocol setAField1(String aField1) {
        this.aProtocolField1 = aField1;
        return this;
    }

    public AProtocol setAField2(String aField2) {
        this.aProtocolField2 = aField2;
        return this;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute()");
        System.out.println("aProtocolField1 = " + aProtocolField1);
        System.out.println("aProtocolField2 = " + aProtocolField2);
    }
}