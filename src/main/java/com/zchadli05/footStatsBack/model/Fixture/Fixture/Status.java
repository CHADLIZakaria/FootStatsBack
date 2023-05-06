package com.zchadli05.footStatsBack.model.Fixture.Fixture;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    @JsonProperty("long")
    private String c_long;
    @JsonProperty("short")
    private String c_short;
    private Long elapsed;
}
