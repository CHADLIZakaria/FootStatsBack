package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    private Long id;
    private String name;
    private String logo;
    private String update;
}
