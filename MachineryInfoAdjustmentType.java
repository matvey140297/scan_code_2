package grst.model.adjustment.enums;

public enum MachineryInfoAdjustmentType {
    TECH_PASS(1),
    GRAD_YEAR(2),
    VIN(3),
    ENGINE_NUMBER(4),
    MODEL_DATA(5);

    MachineryInfoAdjustmentType(Integer value) {
        this.value = value;
    }

    Integer value;
}


