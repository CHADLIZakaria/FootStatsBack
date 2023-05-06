package com.zchadli05.footStatsBack.model.League;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {
    private Long played;
    private Long win;
    private Long draw;
    private Long lose;
    private Goals goals;
}
