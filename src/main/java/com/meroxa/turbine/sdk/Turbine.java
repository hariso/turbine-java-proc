package com.meroxa.turbine.sdk;

import java.util.List;

public interface Turbine {
    Resource resource(String name);

    List<MeroxaRecord> process(List<MeroxaRecord> records, Processor processor);

}
