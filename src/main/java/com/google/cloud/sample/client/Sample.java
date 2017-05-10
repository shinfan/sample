package com.google.cloud.sample.client;

import com.google.cloud.NoCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample {

    public static void main(String[] args) throws Exception {
        Logger.getLogger("").setLevel(Level.FINE);

        DatastoreOptions options = DatastoreOptions.getDefaultInstance();
        Datastore datastore = options.getService();
    }
}