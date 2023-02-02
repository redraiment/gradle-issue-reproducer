import java.sql.DriverManager

task("list") {
    doLast {
        logger.quiet("Drivers:")
        val drivers = DriverManager.getDrivers()
        while (drivers.hasMoreElements()) {
            val driver = drivers.nextElement()
            logger.quiet("  Driver: ${driver.javaClass.name}")
        }
    }
}
