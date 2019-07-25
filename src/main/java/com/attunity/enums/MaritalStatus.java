package com.attunity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
@AllArgsConstructor
public enum MaritalStatus {
    SINGLE(1,"רווק",new SingleHandler()),
    MARRIED(2,"נשוי",new MarriedHandler()),
    DIVORCED(3,"גרוש",new DivorcedHandler());

    private int dbCode;
    private String hebrewDecs;
    private Handler handler;


    public static MaritalStatus findByDbCode(int dbCode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.getDbCode() == dbCode) {
                return status;
            }
        }
        throw new IllegalStateException(dbCode + " not supported");










    }









}
