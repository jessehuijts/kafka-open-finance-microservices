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
 * Content of the body of a transaction authorisation request 
 *
 * @param scaAuthenticationData SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded. 
 */


data class TransactionAuthorisation (

    /* SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded.  */
    @Json(name = "scaAuthenticationData")
    val scaAuthenticationData: kotlin.String

)
