package com.study.kafka.client.s02_pub_ack;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

public class MyProducerInterceptor1 implements ProducerInterceptor {
    @Override
    public ProducerRecord onSend(ProducerRecord record) {
        System.out.println("MyProducerInterceptor1 -- onSend() record:" + record.toString());
        return record;
    }

    @Override
    public void onAcknowledgement(RecordMetadata metadata, Exception exception) {
        if (exception != null) {
            exception.printStackTrace();
        } else {
            System.out.println("MyProducerInterceptor1 -- The offset of the record we just sent is: " + metadata.offset());
        }
    }

    @Override
    public void close() {
        System.out.println("MyProducerInterceptor1 -- close()");
    }

    @Override
    public void configure(Map<String, ?> configs) {
        System.out.println("MyProducerInterceptor1 -- configure() start");
        for (Map.Entry<String, ?> entry : configs.entrySet()) {
            System.out.println(entry.getKey() + "，" + entry.getValue());
        }
        System.out.println("MyProducerInterceptor1 -- configure() end");
    }
}
