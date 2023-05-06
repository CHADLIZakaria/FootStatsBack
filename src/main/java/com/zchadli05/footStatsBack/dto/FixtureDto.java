package com.zchadli05.footStatsBack.dto;

import com.zchadli05.footStatsBack.model.Fixtures.Fixture;
import com.zchadli05.footStatsBack.model.Fixtures.Goals;
import com.zchadli05.footStatsBack.model.Fixtures.Score;
import com.zchadli05.footStatsBack.model.Fixtures.Teams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixtureDto {
    private Fixture fixture;
    private Teams teams;
    private Goals goals;
    private Score score;
}
