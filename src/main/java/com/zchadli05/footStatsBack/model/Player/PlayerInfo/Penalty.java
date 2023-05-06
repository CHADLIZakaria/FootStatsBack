package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

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
