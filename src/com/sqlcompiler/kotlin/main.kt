package com.sqlcompiler.kotlin

/**
 * IMPORTANT
 * Mapper is just read from file(s) and then do <where condition> work and save the results.
 * Shuffler receive Mapper results and partitions them into several files depending on the keys
 * the shuffler role is appearing when we are using group by in our query but in the other situations
 * there is no difference.
 * The sort operation doesn't need to perform in a separated process and we can do it implicitly
 * with Shuffler.
 * Reducer read shuffler results and filter the desired columns, execute functions (min, max, count ...).
 */
fun main() {
    /*
    Handler.createTable(Table("c",
            arrayListOf(Column("id", "int"),
                    Column("name", "string"),
                    Column("salary", "int"),
                    Column("birth_year", "int")),
            arrayListOf("tables\\c\\c1.csv",
                    "tables\\c\\c2.csv")))
    */
//
//    Handler.select(
//            arrayListOf(Table("devices",
//                    arrayListOf(Column("id", "int"),
//                            Column("name", "string"),
//                            Column("price", "int")),
//                    Environment.TABLES_PATH + "devices.csv")),
//            "devices_id < 10 && devices_price == 1111" to arrayListOf("devices_id", "devices_price")
//    )

    Handler.select1(
            arrayListOf("c"),
            "c_id >= 2 && c_id <= 5" to arrayListOf("c_id", "c_salary"),
            arrayListOf("c_id", "c_name"),
            arrayListOf("c_name", "c_id")
    )
}