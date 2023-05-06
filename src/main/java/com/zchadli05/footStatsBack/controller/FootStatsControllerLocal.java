package com.zchadli05.footStatsBack.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.zchadli05.footStatsBack.dto.FixtureResponseDto;
import com.zchadli05.footStatsBack.model.FootStatResponse;
import com.zchadli05.footStatsBack.model.Fixture.FixtureResponse;
import com.zchadli05.footStatsBack.model.League.StandingsResponse;
import com.zchadli05.footStatsBack.model.LeagueStats.LeagueStatsResponse;
import com.zchadli05.footStatsBack.model.Leagues.LeaguesResponse;
import com.zchadli05.footStatsBack.model.Lineups.LineupsResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerInfo.PlayerInfoResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTransfer.PlayerTransferResponse;
import com.zchadli05.footStatsBack.model.Player.PlayerTrophies.PlayerTrophiesResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Profile("dev")
public class FootStatsControllerLocal {
   
    @RequestMapping(value = "/players/topassists", method = RequestMethod.GET)
    public FootStatResponse<LeagueStatsResponse> topassists(@RequestParam(required = false, name = "id") Long id) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/top-assists.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<LeagueStatsResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/players/topscorers", method = RequestMethod.GET)
    public FootStatResponse<LeagueStatsResponse> topscorers(@RequestParam(required = false, name = "id") Long id) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/top-soccers.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<LeagueStatsResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }
    
    @RequestMapping(value = "/leagues", method = RequestMethod.GET)
    public FootStatResponse<LeaguesResponse> leagues(@RequestParam(required = false, name = "id") Long id) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/leagues.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<LeaguesResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }
   
    @RequestMapping(value = "/fixtures", method = RequestMethod.GET)
    public FootStatResponse<FixtureResponseDto> fixtures(@RequestParam("date") String date) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/fixtures.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<FixtureResponseDto> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/fixtures/lineups", method = RequestMethod.GET)
    public FootStatResponse<LineupsResponse> lineups(@RequestParam("fixture") String fixture) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/lineups.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<LineupsResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/fixture", method = RequestMethod.GET)
    public FootStatResponse<FixtureResponse> fixture(@RequestParam("id") Long fixture) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/fixture.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<FixtureResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public FootStatResponse<PlayerInfoResponse> playerInfo(@RequestParam("id") Long idPlayer, @RequestParam("season") Long season) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/player.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<PlayerInfoResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/trophies", method = RequestMethod.GET)
    public FootStatResponse<PlayerTrophiesResponse> playerTrophies(@RequestParam("player") Long player) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/trophies.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<PlayerTrophiesResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/transfers", method = RequestMethod.GET)
    public FootStatResponse<PlayerTransferResponse> playerTransfers(@RequestParam("player") Long player) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/transfers.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<PlayerTransferResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }

    @RequestMapping(value = "/standings", method = RequestMethod.GET)
    public FootStatResponse<StandingsResponse> standings(@RequestParam("season") Long season, @RequestParam("league") Long league) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data/standings.json"));
        @SuppressWarnings("unchecked")
        FootStatResponse<StandingsResponse> sample = new Gson().fromJson(br, FootStatResponse.class); 
        return sample;
    }
}
