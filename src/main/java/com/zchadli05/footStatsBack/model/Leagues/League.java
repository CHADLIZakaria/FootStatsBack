package com.zchadli05.footStatsBack.model.Leagues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class League {
    private Integer id;
    private String name;
    private String type;
    private String logo;
}
