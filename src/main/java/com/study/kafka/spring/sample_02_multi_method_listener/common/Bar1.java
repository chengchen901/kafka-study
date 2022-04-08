package com.study.kafka.spring.sample_02_multi_method_listener.common;

public class Bar1 {
    public String bar;

    public Bar1() {
    }

    public Bar1(String bar) {
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
        return "Bar1{" +
                "bar='" + bar + '\'' +
                '}';
    }
}
