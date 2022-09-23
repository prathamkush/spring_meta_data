package com.springmetadata.springmetadata.componentScan;

import com.springmetadata.springmetadata.configuration.Filterr;

public class CheckComponentScan implements Filterr {


    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"abc","def"};
    }
}
