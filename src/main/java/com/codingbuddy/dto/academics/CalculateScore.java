package com.codingbuddy.dto.academics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculateScore {
    private int pageId;
    private int score;
    private int time;
}
