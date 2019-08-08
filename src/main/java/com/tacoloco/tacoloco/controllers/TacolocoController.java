package com.tacoloco.tacoloco.controllers;

import com.tacoloco.tacoloco.models.Quantity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TacolocoController {

    private static double VegTaco = 2.5;
    private static double ChickenOrBeefTaco = 3.0;
    private static double ChorizoTaco = 3.5;


    @PostMapping("/api/v1/create-order")
    @ResponseBody
    public double createOrder(@RequestBody Quantity quantity){
        int totalQuantity = quantity.getVegTacoQuantity()+quantity.getChickenOrBeefTacoQuantity()+quantity.getChorizoTacoQuantity();

        double totalPrice = quantity.getVegTacoQuantity() * VegTaco
                + quantity.getChickenOrBeefTacoQuantity() * ChickenOrBeefTaco
                + quantity.getChorizoTacoQuantity() * ChorizoTaco;

        return (totalQuantity >= 4)? Math.round(totalPrice * .8 * 100.0) / 100.0 : totalPrice;
    }

}
