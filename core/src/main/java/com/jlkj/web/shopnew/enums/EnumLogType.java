package com.jlkj.web.shopnew.enums;


import lombok.Getter;

@Getter
public enum EnumLogType {

    LOG_SAVE(1, "保存"),;


    private int type;

    private String typeName;

    EnumLogType(int type, String typeName) {
        this.type = type;
        this.typeName = typeName;
    }


}
