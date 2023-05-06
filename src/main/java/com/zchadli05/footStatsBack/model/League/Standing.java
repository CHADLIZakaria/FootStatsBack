package com.zchadli05.footStatsBack.model.League;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Standing {
    private String rank;
    private Team team;
    private String points;
    private String goalsDiff;
    private String group;
    private String form;
    private String status;
    private String description;
    private Stats all;
    private Stats home;
    private Stats away;
    private String update;
}
