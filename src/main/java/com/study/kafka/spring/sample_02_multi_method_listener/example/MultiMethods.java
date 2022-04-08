package com.study.kafka.spring.sample_02_multi_method_listener.example;

import com.study.kafka.spring.sample_01_pub_sub.common.Foo2;
import com.study.kafka.spring.sample_02_multi_method_listener.common.Bar2;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "multiGroup", topics = { "foos", "bars" })
public class MultiMethods {

    @KafkaHandler
    public void foo(Foo2 foo) {
        System.out.println("Received: " + foo);
    }

    // 多个相同类型参数会报错
    // org.springframework.kafka.KafkaException: Seek to current after exception; nested exception is org.springframework.kafka.KafkaException: Ambiguous methods for payload type: class com.study.kafka.sample_01_pub_sub.common.Foo2: foo1 and foo
    /*@KafkaHandler
    public void foo1(Foo2 foo) {
        System.out.println("Received-foo2-1: " + foo);
    }*/

    @KafkaHandler
    public void bar(Bar2 bar) {
        System.out.println("Received: " + bar);
    }

    /*@KafkaHandler
    public void bar1(Bar2 bar) {
        System.out.println("Received=bar2-1: " + bar);
    }*/

    @KafkaHandler(isDefault = true)
    public void unknown(Object object) {
        System.out.println("Received unknown: " + object);
    }
}
