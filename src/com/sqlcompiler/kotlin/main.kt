package com.sqlcompiler.kotlin

/**
 * IMPORTANT
 * mapper is just read from file(s) and then do <where condition> work and save the results.
 * Shuffler receive mapper results and partitions them into several files depending on the keys
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

    /*
    Handler.select(
            arrayListOf(Table("devices",
                    arrayListOf(Column("id", "int"),
                            Column("name", "string"),
                            Column("price", "int")),
                    Environment.TABLES_PATH + "devices.csv")),
            "devices_id < 10 && devices_price == 1111" to arrayListOf("devices_id", "devices_price")
    )
    */
//    Handler.select(names = arrayListOf("c"),
//            desiredColumns = arrayListOf(DesiredColumn("c_name"), DesiredColumn("c_id")),
//            conditions = "c_id < 5" + Utils.smartSplit("c_id", Handler.select(names = arrayListOf("c"),
//                    desiredColumns = arrayListOf(DesiredColumn("c_id")),
//                    conditions = "" to arrayListOf(),
//                    groupBy = arrayListOf(),
//                    orderBy = arrayListOf())) to arrayListOf("c_id"),
//            groupBy = arrayListOf(),
//            orderBy = arrayListOf())

    Handler.select(arrayListOf("c"),
            arrayListOf(DesiredColumn("id", "min"), DesiredColumn("name")),
            "" to arrayListOf(),
            arrayListOf("name"),
            arrayListOf())
}