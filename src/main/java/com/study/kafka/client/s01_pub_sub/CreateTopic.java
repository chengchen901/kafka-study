package com.study.kafka.client.s01_pub_sub;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;

public class CreateTopic {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.254.170:9092");

        try (AdminClient admin = AdminClient.create(props);) {
            admin.createTopics(Collections.singletonList(new NewTopic("test", 1, (short) 1)));
        }
    }
}
