package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatisticPalyer {
    private Games games;
    private Long offsides;
    private Shots shots;
    private Goals goals;
    private Passes passes;
    private Tackles tackles;
    private Duels duels;
    private Dribbles dribbles;
    private Fouls fouls;
    private Cards cards;
    private Penalty penalty;
}
