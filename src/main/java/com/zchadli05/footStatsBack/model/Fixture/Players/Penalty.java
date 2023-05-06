package com.zchadli05.footStatsBack.model.Fixture.Players;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Penalty {
    private Long won;
    private Long commited;
    private Long scored;
    private Long missed;
    private Long saved;
}