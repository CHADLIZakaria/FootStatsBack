package com.zchadli05.footStatsBack.model.Player.PlayerTransfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teams {
    private Team in;
    private Team out;
}
