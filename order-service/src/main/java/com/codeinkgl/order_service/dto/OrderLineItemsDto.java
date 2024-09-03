package com.codeinkgl.order_service.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private  Integer  quantity;
}
