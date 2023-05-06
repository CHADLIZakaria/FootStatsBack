package com.zchadli05.footStatsBack.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zchadli05.footStatsBack.dto.FixtureDto;
import com.zchadli05.footStatsBack.dto.FixtureResponseDto;
import com.zchadli05.footStatsBack.model.FootStatResponse;
import com.zchadli05.footStatsBack.model.Fixtures.FixturesResponse;
import com.zchadli05.footStatsBack.model.Fixtures.League;

public class FootStatsConverter {
     /*
    public FootStatResponse<FixtureResponseDto> toFixtureResponseDto(FootStatResponse<FixtureResponse> fixtureResponse) {
        FootStatResponse<FixtureResponseDto> footStatResponse = new FootStatResponse<FixtureResponseDto>();
        footStatResponse.setGet(fixtureResponse.getGet());
        footStatResponse.setPaging(fixtureResponse.getPaging());
        footStatResponse.setParameters(fixtureResponse.getParameters());
        footStatResponse.setResults(fixtureResponse.getResults());
        footStatResponse.setErrors(fixtureResponse.getErrors());
        footStatResponse.setResults(fixtureResponse.getResults());
        List<FixtureResponseDto> fixturesResponseDto = new ArrayList<>();
        Map<League, List<FixturesResponse>> data =  fixtureResponse.response.stream().collect(Collectors.groupingBy(FixturesResponse::getLeague));
        data.forEach((league, fixtures) -> {
            FixtureResponseDto fixtureResponseDto = new FixtureResponseDto();
            fixtureResponseDto.setLeague(league);
            fixtureResponseDto.setFixtures(toFixturesDto(fixtures));
            fixturesResponseDto.add(fixtureResponseDto);
        });
        footStatResponse.setResponse(fixturesResponseDto);
        return footStatResponse;
    }
    */
    public FootStatResponse<FixtureResponseDto> toFixtureResponseDto(FootStatResponse<FixturesResponse> fixtureResponse) {
        FootStatResponse<FixtureResponseDto> footStatResponse = new FootStatResponse<FixtureResponseDto>();
        footStatResponse.setGet(fixtureResponse.getGet());
        footStatResponse.setPaging(fixtureResponse.getPaging());
        footStatResponse.setParameters(fixtureResponse.getParameters());
        footStatResponse.setResults(fixtureResponse.getResults());
        footStatResponse.setErrors(fixtureResponse.getErrors());
        footStatResponse.setResults(fixtureResponse.getResults());
        List<FixtureResponseDto> fixturesResponseDto = new ArrayList<>();
        Map<League, List<FixturesResponse>> data =  fixtureResponse.response.stream().collect(Collectors.groupingBy(FixturesResponse::getLeague));
        data.forEach((league, fixtures) -> {
            FixtureResponseDto fixtureResponseDto = new FixtureResponseDto();
            fixtureResponseDto.setLeague(league);
            fixtureResponseDto.setFixtures(toFixturesDto(fixtures));
            fixturesResponseDto.add(fixtureResponseDto);
        });
        footStatResponse.setResponse(fixturesResponseDto);
        return footStatResponse;
    }
    
    public FixtureDto toFixtureDto(FixturesResponse fixtureResponse) {
        FixtureDto fixtureDto = new FixtureDto();
        fixtureDto.setFixture(fixtureResponse.getFixture());
        fixtureDto.setGoals(fixtureResponse.getGoals());
        fixtureDto.setScore(fixtureResponse.getScore());
        fixtureDto.setTeams(fixtureResponse.getTeams());
        return fixtureDto;
    }

    public List<FixtureDto> toFixturesDto(List<FixturesResponse> fixtureResponses) {
        List<FixtureDto> fixturesDto = new ArrayList<FixtureDto>();
        fixtureResponses.stream().forEach(fixture -> {
            fixturesDto.add(toFixtureDto(fixture));
        });
        return fixturesDto;
    }
}
