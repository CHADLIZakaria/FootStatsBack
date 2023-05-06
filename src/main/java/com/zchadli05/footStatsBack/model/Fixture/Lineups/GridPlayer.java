package com.zchadli05.footStatsBack.model.Fixture.Lineups;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GridPlayer {
    private Long id;
    private String name;
    private Long number;
    private String pos;
    private String grid;
}
