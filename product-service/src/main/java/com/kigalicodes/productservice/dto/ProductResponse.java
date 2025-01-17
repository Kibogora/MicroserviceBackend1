package com.kigalicodes.productservice.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class ProductResponse {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
