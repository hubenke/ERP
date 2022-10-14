package com.gxa.service;

import com.gxa.entity.Outbound;

import java.util.List;

public interface OutboundService {
    List<Outbound> queryOutbound();
    void addOutbound(Outbound outbound);
}
