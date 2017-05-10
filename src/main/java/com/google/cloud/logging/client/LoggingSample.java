package com.google.cloud.logging.client;

import com.google.cloud.logging.Logging;
import com.google.cloud.logging.LoggingOptions;
import com.google.cloud.logging.MetricInfo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingSample {

    public static void main(String[] args) throws Exception {
        Logger.getLogger("").setLevel(Level.FINE);
        LoggingOptions options = LoggingOptions.getDefaultInstance();
        try (Logging logging = options.getService()) {
            // use logging here
            MetricInfo metricInfo = MetricInfo.newBuilder("test-metric", "severity >= ERROR")
                    .setDescription("Log entries with severity higher or equal to ERROR")
                    .build();
            logging.create(metricInfo);
            System.out.printf("%s", "String");
        }
    }
}