package com.aminography.primecalendar.common

import java.util.*

/**
 * @author aminography
 */

internal const val delimiter = "/"

internal fun normalize(i: Int): String = String.format(Locale.getDefault(), if (i <= 9) "0%d" else "%d", i)
