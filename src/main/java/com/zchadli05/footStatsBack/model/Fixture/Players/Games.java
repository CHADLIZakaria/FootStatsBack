package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Games {
    private Long minutes;
    private Long number;
    private String position;
    private String rating;
    private Boolean captain;
    private Boolean substitute;
}
