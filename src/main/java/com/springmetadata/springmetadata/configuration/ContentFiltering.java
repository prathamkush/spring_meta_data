package com.springmetadata.springmetadata.configuration;


// Making this class - ContentFiltering as a bean
public class ContentFiltering implements Filterr {
    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Italian Job","MI","MI3"};
    }
}
