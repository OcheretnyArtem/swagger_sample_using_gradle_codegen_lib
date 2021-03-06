/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Swagger Petstore
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package by.ocheretny.codegen.samples.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.ZonedDateTime

/**
 * @property id
 * @property petId
 * @property quantity
 * @property shipDate
 * @property status Order Status
 * @property complete
 */
@JsonClass(generateAdapter = true)
data class Order(
    @Json(name = "id") @field:Json(name = "id") var id: Long? = null,
    @Json(name = "petId") @field:Json(name = "petId") var petId: Long? = null,
    @Json(name = "quantity") @field:Json(name = "quantity") var quantity: Int? = null,
    @Json(name = "shipDate") @field:Json(name = "shipDate") var shipDate: ZonedDateTime? = null,
    @Json(name = "status") @field:Json(name = "status") var status: Order.StatusEnum? = null,
    @Json(name = "complete") @field:Json(name = "complete") var complete: Boolean? = null
) {
    /**
     * Order Status
     * Values: PLACED, APPROVED, DELIVERED
     */
    @JsonClass(generateAdapter = false)
    enum class StatusEnum(val value: String) {
        @Json(name = "placed") PLACED("placed"),
        @Json(name = "approved") APPROVED("approved"),
        @Json(name = "delivered") DELIVERED("delivered")
    }
}
