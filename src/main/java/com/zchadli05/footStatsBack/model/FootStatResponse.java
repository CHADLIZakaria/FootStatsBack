package com.zchadli05.footStatsBack.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FootStatResponse<T> {
    public String get;
    public Object parameters;
    public List<Object> errors;
    public Integer results;
    public Paging paging;
    public List<T> response;
}

