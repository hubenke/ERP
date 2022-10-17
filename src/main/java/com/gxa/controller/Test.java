package com.gxa.controller;

import com.gxa.service.SupplierService;
import com.gxa.service.impl.SupplierServiceImpl;

public class Test {

    public static void main(String[] args) {
        SupplierService supplierService1 = new SupplierServiceImpl();
        supplierService1.addGoods("1120,1121",1);
    }
}
