package com.codeinkgl.order_service.dto;

import com.codeinkgl.order_service.model.OrderLineItems;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtosList;
}
