package com.meroxa.turbine;

import java.util.List;

import com.meroxa.turbine.sdk.MeroxaRecord;
import com.meroxa.turbine.sdk.Resource;
import com.meroxa.turbine.sdk.ResourceConfig;
import com.meroxa.turbine.sdk.Turbine;
import com.meroxa.turbine.sdk.TurbineApp;

public class App implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        Resource source = turbine.resource("cck_1");

        List<MeroxaRecord> records = source.records("inbound", null);

        List<MeroxaRecord> res = turbine.process(records, this::addSomeMetadata);

        Resource dest = turbine.resource("demopg");

        dest.write(
            res,
            "inbound_events",
            new ResourceConfig()
                .with("key.converter", "org.apache.kafka.connect.storage.StringConverter")
                .with("key.converter.schemas.enable", "true")
        );
    }

    private List<MeroxaRecord> addSomeMetadata(List<MeroxaRecord> meroxaRecords) {
        return null;
    }
}
