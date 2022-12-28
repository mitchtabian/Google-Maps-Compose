package com.codingwithmitch.composegooglemaps.clusters

import android.content.Context
import com.google.android.gms.maps.GoogleMap
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.collections.MarkerManager

class QuarantineClusterManager(
    context: Context,
    googleMap: GoogleMap,
): ClusterManager<QuarantineClusterItem>(context, googleMap, MarkerManager(googleMap))