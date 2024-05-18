/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This data element is containing information about the status of the SCA method applied.   The following codes are defined for this data type.    * 'received':     An authorisation or cancellation-authorisation resource has been created successfully.   * 'psuIdentified':     The PSU related to the authorisation or cancellation-authorisation resource has been identified.   * 'psuAuthenticated':     The PSU related to the authorisation or cancellation-authorisation resource has been identified and authenticated e.g. by a password or by an access token.   * 'scaMethodSelected':     The PSU/TPP has selected the related SCA routine.      If the SCA method is chosen implicitly since only one SCA method is available,      then this is the first status to be reported instead of 'received'.   * 'unconfirmed':     SCA is technically successfully finalised by the PSU, but the authorisation resource needs a confirmation command by the TPP yet.    * 'started':     The addressed SCA routine has been started.   * 'finalised':     The SCA routine has been finalised successfully (including a potential confirmation command).      This is a final status of the authorisation resource.   * 'failed':     The SCA routine failed.     This is a final status of the authorisation resource.   * 'exempted':     SCA was exempted for the related transaction, the related authorisation is successful.     This is a final status of the authorisation resource. 
 *
 * Values: received,psuIdentified,psuAuthenticated,scaMethodSelected,started,unconfirmed,finalised,failed,exempted
 */

@JsonClass(generateAdapter = false)
enum class ScaStatus(val value: kotlin.String) {

    @Json(name = "received")
    received("received"),

    @Json(name = "psuIdentified")
    psuIdentified("psuIdentified"),

    @Json(name = "psuAuthenticated")
    psuAuthenticated("psuAuthenticated"),

    @Json(name = "scaMethodSelected")
    scaMethodSelected("scaMethodSelected"),

    @Json(name = "started")
    started("started"),

    @Json(name = "unconfirmed")
    unconfirmed("unconfirmed"),

    @Json(name = "finalised")
    finalised("finalised"),

    @Json(name = "failed")
    failed("failed"),

    @Json(name = "exempted")
    exempted("exempted");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ScaStatus) "$data" else null

        /**
         * Returns a valid [ScaStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ScaStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
