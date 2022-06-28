package com.solvd.automation.apiTest;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.api.GetWeather;
import com.solvd.automation.api.GetWeatherByCity;
import com.solvd.automation.api.GetWeatherByLatlon;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ApiTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test(description = "get weather")
    @MethodOwner(owner = "Lucas")
    public void testGetWeather() {
        LOGGER.info("Test: Get Weather");
        GetWeather getWeather = new GetWeather();
        getWeather.callAPIExpectSuccess();
        getWeather.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeather.validateResponseAgainstSchema("automationTest/api/_get/_getWeather/rs.schema");
    }

    @Test(description = "get weather by city")
    @MethodOwner(owner = "Lucas")
    public void testGetWeatherByCity() {
        LOGGER.info("Test: Get Weather by City");
        GetWeatherByCity getWeatherByCity = new GetWeatherByCity();
        getWeatherByCity.callAPIExpectSuccess();
        getWeatherByCity.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherByCity.validateResponseAgainstSchema("automationTest/api/_get/_getCity/rs.schema");
    }

    @Test(description = "get weather by latlon")
    @MethodOwner(owner = "Lucas")
    public void testGetWeatherByLatLon() {
        LOGGER.info("Test: Get Weather by Latlon");
        GetWeatherByLatlon getWeatherByLatlon = new GetWeatherByLatlon();
        getWeatherByLatlon.callAPIExpectSuccess();
        getWeatherByLatlon.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherByLatlon.validateResponseAgainstSchema("automationTest/api/_get/_getLatLon/rs.schema");
    }
}