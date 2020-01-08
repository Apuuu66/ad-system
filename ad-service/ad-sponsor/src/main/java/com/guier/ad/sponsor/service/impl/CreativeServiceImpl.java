package com.guier.ad.sponsor.service.impl;


import com.guier.ad.sponsor.dao.CreativeRepository;
import com.guier.ad.sponsor.entity.Creative;
import com.guier.ad.sponsor.vo.CreativeRequest;
import com.guier.ad.sponsor.vo.CreativeResponse;
import com.guier.ad.sponsor.service.ICreativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
