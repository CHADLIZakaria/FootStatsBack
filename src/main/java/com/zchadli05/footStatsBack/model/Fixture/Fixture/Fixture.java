package com.zchadli05.footStatsBack.model.Fixture.Fixture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fixture {
    private Long id;
    private String referee;
    private String timezone;
    private String date;
    private Long timestamp;
    private Periods periods;
    private Venue venue;
    private Status status;
}
