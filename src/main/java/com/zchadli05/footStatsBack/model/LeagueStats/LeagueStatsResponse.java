package com.zchadli05.footStatsBack.model.LeagueStats;

import java.util.List;

import com.zchadli05.footStatsBack.model.Player.PlayerInfo.Player;
import com.zchadli05.footStatsBack.model.Player.PlayerInfo.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueStatsResponse {
    private Player player;
    private List<Statistics> statistics;
}
