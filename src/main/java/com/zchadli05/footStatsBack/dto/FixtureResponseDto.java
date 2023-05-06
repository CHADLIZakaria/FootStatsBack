package com.zchadli05.footStatsBack.dto;

import java.util.List;

import com.zchadli05.footStatsBack.model.Fixtures.League;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixtureResponseDto {
    private List<FixtureDto> fixtures;
    private League league;
}