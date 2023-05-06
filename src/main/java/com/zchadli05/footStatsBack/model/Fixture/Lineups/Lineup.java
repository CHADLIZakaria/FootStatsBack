package com.zchadli05.footStatsBack.model.Fixture.Lineups;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lineup {
    private LineupTeam team;
    private String formation;
    private Coach coach;
    private List<LineupPlayer> startXI;
    private List<LineupPlayer> substitutes;
}
