package com.aws.peach.domain.order.vo;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ShippingInformation {

    private String country;
    private String city;
    private String zipCode;
    private String telephoneNumber;
    private String receiver;
}
