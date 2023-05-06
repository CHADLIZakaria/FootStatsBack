package com.zchadli05.footStatsBack.model.Fixture.Statitics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistic {
    private String type;
    private Object value;
}
