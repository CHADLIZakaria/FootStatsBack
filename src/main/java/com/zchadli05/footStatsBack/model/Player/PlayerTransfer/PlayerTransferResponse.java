package com.zchadli05.footStatsBack.model.Player.PlayerTransfer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerTransferResponse {
    private Player player;
    private String update;
    private List<Transfers> transfers;
}
