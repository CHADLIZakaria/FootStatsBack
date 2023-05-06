package com.zchadli05.footStatsBack.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zchadli05.footStatsBack.dto.FixtureResponseDto;
import com.zchadli05.footStatsBack.mapper.FootStatsConverter;
import com.zchadli05.footStatsBack.model.FootStatResponse;
import com.zchadli05.footStatsBack.model.Fixture.FixtureResponse;
import com.zchadli05.footStatsBack.model.League.StandingsResponse;
import com.zchadli05.footStatsBack.model.LeagueStats.LeagueStatsResponse;
import com.zchadli05.footStatsBack.model.Leagues.LeaguesResponse;
import com.zchadli05.footStatsBack.model.Lineups.LineupsResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerInfo.PlayerInfoResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTransfer.PlayerTransferResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTrophies.PlayerTrophiesResponse;
import com.zchadli05.footStatsBack.ws_service.MicroserviceFootStats;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Profile("prod")
public class FootStatsController {
    
    private final MicroserviceFootStats microserviceFootStats;

    private FootStatsConverter mapper = new FootStatsConverter();

    @RequestMapping(value = "/leagues", method = RequestMethod.GET)
    public FootStatResponse<LeaguesResponse> leagues(@RequestParam(name="id", required = false) Long id) {
        return microserviceFootStats.leagues(id);
    }

    @RequestMapping(value = "/fixtures", method = RequestMethod.GET)
    public FootStatResponse<FixtureResponseDto> fixtures(@RequestParam("date") String date) {
        return mapper.toFixtureResponseDto(microserviceFootStats.fixtures(date));
    }

    @RequestMapping(value = "/fixtures/lineups", method = RequestMethod.GET)
    public FootStatResponse<LineupsResponse> lineups(@RequestParam("fixture") String fixture) {
        return microserviceFootStats.lineups(fixture);
    }
    
    @RequestMapping(value = "/fixture", method = RequestMethod.GET)
    public FootStatResponse<FixtureResponse> fixture(@RequestParam("id") Long fixture) {
        return microserviceFootStats.fixture(fixture);
    }



    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public FootStatResponse<PlayerInfoResponse> playerInfo(@RequestParam("id") Long idPlayer, @RequestParam("season") Long season) {
        return microserviceFootStats.playerInfo(idPlayer, season);
    }

    @RequestMapping(value = "/trophies", method = RequestMethod.GET)
    public FootStatResponse<PlayerTrophiesResponse> playerTrophies(@RequestParam("player") Long player) {
        return microserviceFootStats.playerTrophies(player);
    }

    @RequestMapping(value = "/transfers", method = RequestMethod.GET)
    public FootStatResponse<PlayerTransferResponse> playerTransfers(@RequestParam("player") Long player) {
        return microserviceFootStats.playerTransfers(player);
    }

    @RequestMapping(value = "/standings", method = RequestMethod.GET)
    public FootStatResponse<StandingsResponse> standings(@RequestParam("season") Long season, @RequestParam("league") Long league)  {
        return microserviceFootStats.standings(season, league);
    }

    @RequestMapping(value = "/players/topscorers", method = RequestMethod.GET)
    public FootStatResponse<LeagueStatsResponse> topscorers(@RequestParam("season") Long season, @RequestParam("league") Long league)  {
        return microserviceFootStats.topscorers(season, league);
    }

    @RequestMapping(value = "/players/topassists", method = RequestMethod.GET)
    public FootStatResponse<LeagueStatsResponse> topassists(@RequestParam("season") Long season, @RequestParam("league") Long league)  {
        return microserviceFootStats.topassists(season, league);
    }

}
