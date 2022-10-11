package com.meroxa.turbine.sdk;

import java.util.List;
import java.util.function.Function;

public interface Processor extends Function<List<MeroxaRecord>, List<MeroxaRecord>> {
}
