package com.codingwithmitch.composegooglemaps.clusters

import android.content.Context
import com.google.android.gms.maps.GoogleMap
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.collections.MarkerManager

class ZoneClusterManager(
    context: Context,
    googleMap: GoogleMap,
): ClusterManager<ZoneClusterItem>(context, googleMap, MarkerManager(googleMap))