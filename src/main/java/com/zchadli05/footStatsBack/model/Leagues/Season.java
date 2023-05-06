package com.zchadli05.footStatsBack.model.Leagues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    private Integer year;
    private String start;
    private String end;
    private Boolean current;
    private Coverage coverage;
    
}
