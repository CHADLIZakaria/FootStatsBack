package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passes {
    private Long total;
    private Long key;
    private Long accuracy;
}
