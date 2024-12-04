package com.abe.thais.demo.models;

import lombok.*;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Coin {
    private String base_code;
    private Map<String, Double> conversion_rates;
//    private long time_last_update_utc;
//    private long time_next_update_utc;

}
