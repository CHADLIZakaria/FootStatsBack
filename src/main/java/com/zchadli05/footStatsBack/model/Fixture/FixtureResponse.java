package com.zchadli05.footStatsBack.model.Fixture;

import java.util.List;

import com.zchadli05.footStatsBack.model.Fixture.Events.Event;
import com.zchadli05.footStatsBack.model.Fixture.Fixture.Fixture;
import com.zchadli05.footStatsBack.model.Fixture.Goals.Goals;
import com.zchadli05.footStatsBack.model.Fixture.League.League;
import com.zchadli05.footStatsBack.model.Fixture.Lineups.Lineup;
import com.zchadli05.footStatsBack.model.Fixture.Players.Players;
import com.zchadli05.footStatsBack.model.Fixture.Score.Score;
import com.zchadli05.footStatsBack.model.Fixture.Statitics.Statistics;
import com.zchadli05.footStatsBack.model.Fixture.Teams.Teams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixtureResponse {
    private Fixture fixture;
    private League league;
    private Teams teams;
    private Goals goals;
    private Score score;
    private List<Event> events;
    private List<Lineup> lineups;
    private List<Statistics> statistics;
    private List<Players> players;
    
}
