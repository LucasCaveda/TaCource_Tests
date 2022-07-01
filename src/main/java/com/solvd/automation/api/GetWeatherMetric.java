package com.solvd.automation.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;


@Endpoint(url= "${base_url}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "automationTest/api/_get/_getMetric/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetWeatherMetric extends AbstractApiMethodV2  {

    public void GetWeatherUsingMetric () {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}