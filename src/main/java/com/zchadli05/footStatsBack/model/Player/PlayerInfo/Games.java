package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Games {
    private Long appearences;
    private Long lineups;
    private Long minutes;
    private Long number;
    private String position;
    private String rating;
    private Boolean captain;
}
