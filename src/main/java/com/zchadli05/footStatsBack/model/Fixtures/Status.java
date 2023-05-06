package com.zchadli05.footStatsBack.model.Fixtures;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    @JsonProperty("long")
    private String s_long;
    @JsonProperty("short")
    private String s_short;
    private String elapsed;
}
