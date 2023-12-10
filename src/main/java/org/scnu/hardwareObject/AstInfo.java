package org.scnu.hardwareObject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AstInfo {

    private Integer LocalVariable;

    private Integer MethodCall;

    private Integer Condition;

    private Integer Cycle;

    private Integer In;

    private Integer Out;

    private Integer AssignMethodCall;

    private Integer Switch;

    private Integer Assign;

    public AstInfo(Integer localVariable, Integer methodCall, Integer condition, Integer cycle, Integer in, Integer out, Integer assignMethodCall, Integer aSwitch, Integer assign) {
        LocalVariable = localVariable;
        MethodCall = methodCall;
        Condition = condition;
        Cycle = cycle;
        In = in;
        Out = out;
        AssignMethodCall = assignMethodCall;
        Switch = aSwitch;
        Assign = assign;
    }

}
