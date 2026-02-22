package org.example.oopsem2lab4application.controller;

import jakarta.validation.Valid;
import org.example.oopsem2lab4application.model.DiscountRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discounts")
public class DiscountController {

    @PostMapping("/apply")
    public ResponseEntity<String> applyDiscount(@Valid @RequestBody DiscountRequest request) {
        return ResponseEntity.ok("Discount applied: " + request.getPercent() + "%");
    }
}