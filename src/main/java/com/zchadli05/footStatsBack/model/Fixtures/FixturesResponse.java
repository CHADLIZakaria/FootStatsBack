package com.zchadli05.footStatsBack.model.Fixtures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixturesResponse {
    private Fixture fixture;
    private League league;
    private Teams teams;
    private Goals goals;
    private Score score;
}
