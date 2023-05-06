package com.zchadli05.footStatsBack.model.Lineups;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineupsResponse {
    public Team team;
    public String formation;
    public List<PlayerPosition> startXI;
    public List<PlayerPosition> substitutes;
    public Coach coach;
}
