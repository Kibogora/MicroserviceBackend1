package com.codeinkgl.order_service.controller;

import com.codeinkgl.order_service.dto.OrderRequest;
import com.codeinkgl.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    @Autowired // Inject the OrderService dependency
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {

        orderService.placeOrder(orderRequest);
        return "order Placed Successfully";
    }
}
