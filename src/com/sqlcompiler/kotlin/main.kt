package com.sqlcompiler.kotlin

import com.sqlcompiler.Environment

fun main() {
//    Handler.createTable(Table("fuckers",
//            arrayListOf(Column("id", "int"),
//                        Column("name", "string")),
//            Environment.TABLES_PATH + "fuckers.csv"))

    Reducer.reduce(Sorter.sort(Shuffler.shuffle(Mapper.map(arrayListOf("", "", "")))))

    Handler.select(
            arrayListOf(Table("devices",
                    arrayListOf(Column("id", "int"),
                            Column("name", "string"),
                            Column("price", "int")),
                    Environment.TABLES_PATH + "devices.csv")),
            "devices_id < 10 && devices_price == 1111" to arrayListOf("devices_id", "devices_price")
    )
}