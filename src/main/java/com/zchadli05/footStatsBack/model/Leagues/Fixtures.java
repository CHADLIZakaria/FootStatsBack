package com.zchadli05.footStatsBack.model.Leagues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fixtures {
    private Boolean events;
    private Boolean lineups;
    private Boolean statistics_fixtures;
    private Boolean statistics_players;
}
