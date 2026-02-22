package org.example.oopsem2lab4application.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountRequest {

    @Min(value = 1, message = "Discount percent must be at least 1")
    @Max(value = 90, message = "Discount percent must be at most 90")
    private int percent;
}