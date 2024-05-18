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

import org.openapitools.client.models.AccountReference
import org.openapitools.client.models.HrefType
import org.openapitools.client.models.LeanAccountReport

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Content of a JSON body of a request from the Push RTP Service.
 *
 * @param account 
 * @param dateTimeLastPush 
 * @param staticCallbackText 
 * @param links A _link object containing any link types. 
 * @param transactions 
 */


data class PushRTPJson (

    @Json(name = "account")
    val account: AccountReference,

    @Json(name = "dateTimeLastPush")
    val dateTimeLastPush: java.time.OffsetDateTime? = null,

    @Json(name = "staticCallbackText")
    val staticCallbackText: kotlin.String? = null,

    /* A _link object containing any link types.  */
    @Json(name = "_links")
    val links: kotlin.collections.Map<kotlin.String, HrefType>? = null,

    @Json(name = "transactions")
    val transactions: LeanAccountReport? = null

)
