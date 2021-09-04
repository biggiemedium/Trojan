package dev.px.trojan.util

object OSChecker {

    val os = System.getProperty("os.name").toLowerCase()


    fun isMac(): Boolean {
        var OS = System.getProperty("os.name").toLowerCase()
        return OS.contains("mac")
    }

    fun isWindows(): Boolean {
        return os.contains("win")
    }

    fun isLinux(): Boolean {
        return os.contains("nix") || os.contains("nux") || os.contains("aix")
    }

    enum class OS {
        WINDOWS, LINUX, MAC, SOLARIS
    }

    fun getOS(): OS? {
        val os = System.getProperty("os.name").toLowerCase()
        return when {
            os.contains("win") -> {
                OS.WINDOWS
            }
            os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
                OS.LINUX
            }
            os.contains("mac") -> {
                OS.MAC
            }
            os.contains("sunos") -> {
                OS.SOLARIS
            }
            else -> null
        }
    }
}