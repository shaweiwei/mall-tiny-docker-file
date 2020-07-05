package com.macro.mall.tiny.config;

/**
 * 流程步骤
 * @author shamo
 */
public enum ProcessStep {

    /**
     * 检测申请
     */
    INSPECTION_APPLY("0", "inspectionApply"),

    /**
     * 检测指令下发
     */
    INSTRUCTION_ISSUE("1", "instructionIssue"),

    /**
     * 检验员检验
     */
    INSPECT("2", "inspect"),

    /**
     * 审核人审核
     */
    CHECK("3", "check");

    private String code;
    private String name;

    ProcessStep(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return getName();
    }

}
