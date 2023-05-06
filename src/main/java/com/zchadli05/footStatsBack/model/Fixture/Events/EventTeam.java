package com.zchadli05.footStatsBack.model.Fixture.Events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventTeam {
    private Long id;
    private String name;
    private String logo;
}
