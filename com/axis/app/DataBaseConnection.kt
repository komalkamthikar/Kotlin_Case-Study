package com.axis.app

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {

    fun connect(): Connection {
        val myURL = "jdbc:mysql://localhost:3306/kotlindb"
        val connection = DriverManager.getConnection(myURL, "root", "Komal@rock100")
        return connection
    }


}