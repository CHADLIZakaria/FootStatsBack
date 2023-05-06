package com.zchadli05.footStatsBack.model.Fixture.Statitics;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistics {
    private TeamStatistics team;
    private List<Statistic> statistics;
}
