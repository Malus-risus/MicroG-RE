/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.location.network.mozilla

data class GeolocateResponse(
    val location: ResponseLocation?,
    val accuracy: Double?,
    val fallback: String?,
    val error: ResponseError?
)