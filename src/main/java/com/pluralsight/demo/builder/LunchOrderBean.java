package com.pluralsight.demo.builder;

import lombok.Data;

@Data
public class LunchOrderBean {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBean(){}


}
