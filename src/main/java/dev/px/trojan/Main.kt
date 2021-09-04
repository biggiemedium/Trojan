package dev.px.trojan

import dev.px.trojan.util.HWIDutil
import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //val handler = Handler()
        //handler.handle()
        println(HWIDutil.Get.HWID())
    }
}