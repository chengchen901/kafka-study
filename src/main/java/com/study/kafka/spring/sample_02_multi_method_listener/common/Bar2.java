package com.study.kafka.spring.sample_02_multi_method_listener.common;

public class Bar2 {
    public String bar;

    public Bar2() {
    }

    public Bar2(String bar) {
        this.bar = bar;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "bar='" + bar + '\'' +
                '}';
    }
}
