package com.s.projectloomdemo.dispatchers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExecutorCoroutineDispatcher
import java.util.concurrent.Executor
import kotlin.coroutines.CoroutineContext


//val Dispatchers.LOOM: CoroutineDispatcher
//    get() = object : ExecutorCoroutineDispatcher(), Executor {
//
//        override val executor: Executor
//            get() = this
//
//        override fun close() {
//            error("Cannot be invoked on Dispatchers.LOOM")
//        }
//
//        override fun dispatch(context: CoroutineContext, block: Runnable) {
//            Thread.startVirtualThread(block)
//        }
//
//        override fun execute(command: Runnable) {
//            Thread.startVirtualThread(command)
//        }
//
//        override fun toString() = "Dispatchers.LOOM"
//
//    }