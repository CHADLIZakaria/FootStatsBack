package com.zchadli05.footStatsBack.model.Player.PlayerTransfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfers {
    private String date;
    private String type;
    private Teams teams;
}
