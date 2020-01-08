package com.guier.ad.sponsor.service;


import com.guier.ad.sponsor.vo.CreativeRequest;
import com.guier.ad.sponsor.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
