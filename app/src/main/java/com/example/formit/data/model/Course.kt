package com.example.formit.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Course(
    @SerializedName("_id") val id : String,
    @SerializedName("courseName") val courseName: String,
    @SerializedName("description") val description: String,
    @SerializedName("mentor") val mentor: User,
    @SerializedName("price") val price: Int,
    @SerializedName("places") val places: Int,
    @SerializedName("duration") val duration: Int,
    @SerializedName("prerequisites") val prerequisites: String,
    @SerializedName("startDate") val startDate: String,
    @SerializedName("color") val color: String,
    @SerializedName("image") val image: String,
    @SerializedName("usersbookmarked") val usersbookmarked: List<String>,
    @SerializedName("participatedMembers") val participatedMembers: List<String>,
) : Serializable