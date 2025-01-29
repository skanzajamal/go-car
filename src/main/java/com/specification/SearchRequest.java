package com.specification;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SearchRequest {

    private String status;
    private String coordinate;
}
