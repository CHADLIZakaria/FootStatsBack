package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class League {
    private Long id;
    private String name;
    private String country;
    private String logo;
    private String flag;
    private Long season;
}
