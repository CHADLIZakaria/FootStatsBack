package com.zchadli05.footStatsBack.model.Fixture.Teams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teams {
    private Team home;
    private Team away;
}
