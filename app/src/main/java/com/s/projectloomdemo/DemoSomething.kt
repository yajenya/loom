package com.s.projectloomdemo

import java.util.concurrent.Executors

class DemoSomething {
    var vte = Executors.newVirtualThreadExecutor();
    //Scheduler vtScheduler = Schedulers.from(vte);

// sometime later
   // vte.close();
}