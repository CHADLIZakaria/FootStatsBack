package com.zchadli05.footStatsBack.model.Coach.CoachInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Career {
    private Team team;
    private String start;
    private String end;
}
