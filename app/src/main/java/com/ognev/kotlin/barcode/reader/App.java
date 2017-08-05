package com.ognev.kotlin.barcode.reader;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by ognev on 8/5/17.
 */

public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    if (LeakCanary.isInAnalyzerProcess(this)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return;
    }
    LeakCanary.install(this);
  }
}
