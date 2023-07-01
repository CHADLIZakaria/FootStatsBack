package com.zchadli05.footStatsBack.controller;

import com.zchadli05.footStatsBack.model.Coach.CoachInfo.CoachResponse;

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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
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
    public FootStatResponse<PlayerTrophiesResponse> playerTrophies(@RequestParam(required=false, name="player") Long player, @RequestParam(required=false, name="coach") Long coach) {
        return microserviceFootStats.playerTrophies(player, coach);
    }

    @RequestMapping(value = "/transfers", method = RequestMethod.GET)
    public FootStatResponse<PlayerTransferResponse> playerTransfers(@RequestParam("player") Long player) {
        return microserviceFootStats.playerTransfers(player);
    }

    @RequestMapping(value = "/seasons", method = RequestMethod.GET)
    public FootStatResponse<Integer> playerSeasons(@RequestParam("player") Long player)  {
        return microserviceFootStats.playerSeasons(player);
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
    @RequestMapping(value = "/coachs", method = RequestMethod.GET)
    public FootStatResponse<CoachResponse> coach(@RequestParam("id") Long id) throws FileNotFoundException {
        System.out.println(microserviceFootStats.coach(id));
        return microserviceFootStats.coach(id);
    }




}
