package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfoResponse {
    private Player player;
    private List<Statistics> statistics;
}
