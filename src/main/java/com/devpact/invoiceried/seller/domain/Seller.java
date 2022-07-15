package com.devpact.invoiceried.seller.domain;

import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.BankAccount;
import com.devpact.invoiceried.shared.vo.VatNumber;

import java.util.List;

public class Seller {
    private String companyName;
    private Address address;
    private VatNumber vatNumber;
    private List<BankAccount> bankAccount;
}
