package dev.px.trojan.util

class Timer {

    var time: Long = -1

    fun Timer() {
        time = -1
    }

    fun passed(t: Long): Boolean {
        return this.timePassed(System.nanoTime() - this.time) >= t
    }

    fun passedS(seconds: Double): Boolean {
        return this.passed(seconds as Long * 1000L)
    }

    fun reset() {
        this.time = System.nanoTime()
    }

    fun timePassed(time: Long): Long {
        return time / 1000000L
    }
}