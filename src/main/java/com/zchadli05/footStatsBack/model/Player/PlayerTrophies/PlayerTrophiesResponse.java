package com.zchadli05.footStatsBack.model.Player.PlayerTrophies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerTrophiesResponse {
    private String league;
    private String country;
    private String season;
    private String place;
}