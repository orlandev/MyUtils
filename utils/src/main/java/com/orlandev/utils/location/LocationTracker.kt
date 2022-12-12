package com.orlandev.utils.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}