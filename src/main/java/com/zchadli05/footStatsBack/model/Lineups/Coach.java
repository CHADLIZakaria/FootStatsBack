package com.zchadli05.footStatsBack.model.Lineups;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coach {
    private Long id;
    private String name;
    private String photo;
}
