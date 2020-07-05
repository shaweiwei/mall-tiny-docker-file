package com.macro.mall.tiny.config;

/**
 * @author shamo
 */
public enum EquipmentType {

    /**
     * 检测申请
     */
    LIFT("0", "lift"),

    /**
     * end
     */
    CRANE("1", "crane");

    private String code;
    private String name;

    EquipmentType(String code, String name) {
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

    public static EquipmentType getByCode(String code){
        for(EquipmentType processStep : EquipmentType.values()){
            if(code.equals(processStep.getCode())){
                return processStep;
            }
        }
        return  null;
    }
}
