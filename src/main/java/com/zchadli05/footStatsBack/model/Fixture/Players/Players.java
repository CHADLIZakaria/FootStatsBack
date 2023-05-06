package com.zchadli05.footStatsBack.model.Fixture.Players;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Players {
    private Team team;
    private List<StatisticPlayers> players;
}
