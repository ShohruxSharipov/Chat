package com.example.chat.model

data class User(var username:String?, var password:String?, var uid:String? = "${username}_123",val photo: Int?){


    constructor() : this(null,null,null,null)
}
