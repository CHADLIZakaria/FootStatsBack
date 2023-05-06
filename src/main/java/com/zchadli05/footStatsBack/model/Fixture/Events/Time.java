package com.zchadli05.footStatsBack.model.Fixture.Events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    private Long elapsed;
    private Long extra;
}
