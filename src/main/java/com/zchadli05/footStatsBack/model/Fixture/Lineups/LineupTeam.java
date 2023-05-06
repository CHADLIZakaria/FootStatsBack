package com.zchadli05.footStatsBack.model.Fixture.Lineups;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineupTeam {
    private Long id;
    private String name;
    private String logo;
    private Colors colors;
}
