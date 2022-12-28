package com.codingwithmitch.composegooglemaps

import android.location.Location
import com.codingwithmitch.composegooglemaps.clusters.QuarantineClusterItem

data class MapState(
    val lastKnownLocation: Location?,
    val clusterItems: List<QuarantineClusterItem>,
)
