// Automatically generated by flapigen
package org.iota.wallet;


public enum MessagePayloadType {
    TRANSACTION(0),
    MILESTONE(1),
    INDEXATION(2),
    RECEIPT(3),
    TREASURY_TRANSACTION(4);

    private final int value;
    MessagePayloadType(int value) {
        this.value = value;
    }
    public final int getValue() { return value; }
    /*package*/ static MessagePayloadType fromInt(int x) {
        switch (x) {
            case 0: return TRANSACTION;
            case 1: return MILESTONE;
            case 2: return INDEXATION;
            case 3: return RECEIPT;
            case 4: return TREASURY_TRANSACTION;
            default: throw new Error("Invalid value for enum MessagePayloadType: " + x);
        }
    }
}