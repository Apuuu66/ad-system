package com.guier.ad.search.client;

import com.guier.ad.common.vo.CommonResponse;
import com.guier.ad.search.client.vo.AdPlan;
import com.guier.ad.search.client.vo.AdPlanGetRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "ad-sponsor error");
    }
}

