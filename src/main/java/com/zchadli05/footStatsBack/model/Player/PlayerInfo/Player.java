package com.zchadli05.footStatsBack.model.Player.PlayerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Long id;
    private String name;
    private String firstname;
    private String lastname;
    private Long age;
    private Birth birth;
    private String nationality;
    private String height;
    private String weight;
    private Boolean injured;
    private String photo;
}
