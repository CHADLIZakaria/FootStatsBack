package com.zchadli05.footStatsBack.model.Fixtures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Goals halftime;
    private Goals fulltime;
    private Goals extratime;
    private Goals penalty;
}
