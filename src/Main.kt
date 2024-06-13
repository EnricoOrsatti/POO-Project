package com.example

import org.jetbrains.exposed.sql.Database

fun main() {
    val database =
        Database.connect(
                    url = "jdbc:h2:file:./database/db;MODE=MYSQL;DB_CLOSE_DELAY=-1;",
                    user = "root",
                    driver = "org.h2.Driver",
                    password = ""
            )
}