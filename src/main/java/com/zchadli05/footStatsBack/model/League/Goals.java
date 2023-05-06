package com.zchadli05.footStatsBack.model.League;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goals {
    @JsonProperty("for")
    public Long cfor;
    public Long against;
}
