package com.zchadli05.footStatsBack.model.Coach.CoachTrophies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoachTrophiesResponse {
    private String league;
    private String country;
    private String season;
    private String place;
}
