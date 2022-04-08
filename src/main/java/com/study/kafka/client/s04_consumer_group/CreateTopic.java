package com.study.kafka.client.s04_consumer_group;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;

public class CreateTopic {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.254.170:9092");

        try (AdminClient admin = AdminClient.create(props);) {
            admin.createTopics(Collections.singletonList(new NewTopic("test-group", 2, (short) 1)));
            System.out.println("创建Topic ok！");
        }

    }
}
