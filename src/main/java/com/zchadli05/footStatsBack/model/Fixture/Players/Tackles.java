package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tackles {
    private Long total;
    private Long blocks;
    private Long interceptions;
}
