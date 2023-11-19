package com.demo.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class Dto {

    @JsonProperty(namespace = "id")
    private String id;

    @JsonProperty(namespace = "name")
    private String name;

    @JsonProperty(namespace = "age")
    private String age;

    @JsonProperty(namespace = "address")
    private String address;

}
