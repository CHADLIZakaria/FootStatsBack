package com.zchadli05.footStatsBack.model.Leagues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coverage {
    private Fixtures fixtures;
    private Boolean standings;
    private Boolean players;
    private Boolean top_scorers;
    private Boolean top_assists;
    private Boolean top_cards;
    private Boolean injuries;
    private Boolean predictions;    
    private Boolean odds;
}
