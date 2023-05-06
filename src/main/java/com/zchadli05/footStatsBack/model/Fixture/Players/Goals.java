package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goals {
    private Long total;
    private Long conceded;
    private Long assists;
    private Long saves;
}
