package com.zchadli05.footStatsBack.model.Leagues;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaguesResponse {
    public League league;
    public Country country;
    public List<Season> seasons;
}