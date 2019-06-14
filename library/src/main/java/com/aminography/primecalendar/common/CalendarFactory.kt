package com.aminography.primecalendar.common

import com.aminography.primecalendar.PrimeCalendar
import com.aminography.primecalendar.civil.CivilCalendar
import com.aminography.primecalendar.hijri.HijriCalendar
import com.aminography.primecalendar.persian.PersianCalendar

/**
 * A factory class which creates calendar objects based on desired type.
 *
 * @author aminography
 */
object CalendarFactory {

    @JvmStatic
    fun <T : PrimeCalendar> newInstance(clazz: Class<T>): T = clazz.getDeclaredConstructor().newInstance()

    @JvmStatic
    fun newInstance(type: CalendarType): PrimeCalendar {
        return when (type) {
            CalendarType.CIVIL -> CivilCalendar()
            CalendarType.PERSIAN -> PersianCalendar()
            CalendarType.HIJRI -> HijriCalendar()
        }
    }

}
