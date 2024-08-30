package com.subscription.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductGroupDto {
    private String groupId;

    @NotBlank(message = "Vendor ID is required.")
    private String vendorId;

    @NotBlank(message = "Group name is required.")
    private String groupName;

}
