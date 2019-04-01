package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment

fun main() {
//    Handler.createTable(Table("fuckers",
//            arrayListOf(Table.Column("id", "int"),
//                    Table.Column("name", "string")),
//            Environment.TABLES_PATH + "fuckers.csv"))

    Handler.select(
            arrayListOf(
                    Table("devices",
                            arrayListOf(Table.Column("id", "int"),
                                    Table.Column("name", "string"),
                                    Table.Column("price", "int")),
                            Environment.TABLES_PATH + "devices.csv"),
                    Table("users",
                            arrayListOf(Table.Column("name", "string"),
                                    Table.Column("age", "int"),
                                    Table.Column("gender", "int")),
                            Environment.TABLES_PATH + "users.csv"),
                    Table("fuckers",
                            arrayListOf(Table.Column("id", "int"),
                                    Table.Column("name", "string")),
                            Environment.TABLES_PATH + "fuckers.csv")
            ))

}