package com.zchadli05.footStatsBack.ws_service;

import com.zchadli05.footStatsBack.model.Coach.CoachInfo.CoachResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerSeasons.PlayerSeasonsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zchadli05.footStatsBack.model.FootStatResponse;
import com.zchadli05.footStatsBack.model.Fixture.FixtureResponse;
import com.zchadli05.footStatsBack.model.Fixtures.FixturesResponse;
import com.zchadli05.footStatsBack.model.League.StandingsResponse;
import com.zchadli05.footStatsBack.model.LeagueStats.LeagueStatsResponse;
import com.zchadli05.footStatsBack.model.Leagues.LeaguesResponse;
import com.zchadli05.footStatsBack.model.Lineups.LineupsResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerInfo.PlayerInfoResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTransfer.PlayerTransferResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTrophies.PlayerTrophiesResponse;

@FeignClient(name = "microservice-foots", url="https://v3.football.api-sports.io/")
public interface MicroserviceFootStats {

    @GetMapping(value = "/leagues")
    FootStatResponse<LeaguesResponse> leagues(@RequestParam(required = false, name = "id") Long id);

    @GetMapping(value = "/fixtures")
    FootStatResponse<FixturesResponse> fixtures(@RequestParam("date") String date);

    @GetMapping(value = "/fixtures")
    FootStatResponse<FixtureResponse> fixture(@RequestParam("id") Long fixture);

    @GetMapping(value = "/fixtures/lineups")
    FootStatResponse<LineupsResponse> lineups(@RequestParam("fixture") String fixture);
    
    @GetMapping(value = "/players")
    FootStatResponse<PlayerInfoResponse> playerInfo(@RequestParam("id") Long idPlayer, @RequestParam("season") Long season);

    @GetMapping(value = "/players/topscorers")
    FootStatResponse<LeagueStatsResponse> topscorers(@RequestParam("season") Long season, @RequestParam("league") Long league);

    @GetMapping(value = "/players/topassists")
    FootStatResponse<LeagueStatsResponse> topassists(@RequestParam("season") Long season, @RequestParam("league") Long league);

    @GetMapping(value = "/players/seasons")
    FootStatResponse<Integer> playerSeasons(@RequestParam("player") Long player);
    
    @GetMapping(value = "/trophies")
    FootStatResponse<PlayerTrophiesResponse> playerTrophies(@RequestParam(required=false, name="player") Long player, @RequestParam(required=false, name="coach") Long coach);

    @GetMapping(value = "/transfers")
    FootStatResponse<PlayerTransferResponse> playerTransfers(@RequestParam("player") Long player);

    @GetMapping(value = "/standings")
    FootStatResponse<StandingsResponse> standings(@RequestParam("season") Long season, @RequestParam("league") Long league);

    @GetMapping(value = "/coachs")
    FootStatResponse<CoachResponse> coach(@RequestParam("id") Long id);

}
