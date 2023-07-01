package com.zchadli05.footStatsBack.model.Coach.CoachInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoachResponse {
    private Integer id;
    private String name;
    private String firstname;
    private String lastname;
    private Integer age;
    private Birth birth;
    private String nationality;
    private String height;
    private String weight;
    private String photo;
    private Team team;
    private List<Career> career;
}
