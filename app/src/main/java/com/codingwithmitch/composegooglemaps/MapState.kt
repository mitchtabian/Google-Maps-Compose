package com.codingwithmitch.composegooglemaps

import android.location.Location
import com.codingwithmitch.composegooglemaps.clusters.ZoneClusterItem

data class MapState(
    val lastKnownLocation: Location?,
    val clusterItems: List<ZoneClusterItem>,
)
