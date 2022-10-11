package com.meroxa.turbine.sdk;

import java.util.List;

public interface Resource {
    List<MeroxaRecord> records(String name, ResourceConfig resourceConfig);

    void write(List<MeroxaRecord> records, String collection, ResourceConfig resourceConfig);
}
