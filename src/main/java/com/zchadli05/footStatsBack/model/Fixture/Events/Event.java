package com.zchadli05.footStatsBack.model.Fixture.Events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private Time time;
    private EventTeam team;
    private EventPlayer player;
    private EventAssist assist;
    private String type;
    private String detail;
    private String comments;
}
