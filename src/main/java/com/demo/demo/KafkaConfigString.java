package com.demo.demo;

import lombok.Getter;

@Getter
public class KafkaConfigString {
    private String value;

    public KafkaConfigString() {
    }

    public KafkaConfigString(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
