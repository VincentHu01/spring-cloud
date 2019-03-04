package com.ai.msdev.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Id;
//import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    private String code;

    private String name;

    /*public Stock(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
