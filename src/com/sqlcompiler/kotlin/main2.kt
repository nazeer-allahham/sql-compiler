import com.sqlcompiler.kotlin.*

fun main() {
    Handler.select(table = "person",
            columns = arrayListOf(DesiredColumn("person_first_name", "person", "", "", false, arrayListOf()), DesiredColumn("address_name", "address", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Where(" x1 ", arrayListOf(Condition("x1", "personAddress_uid", "100", "<", "number")
                    ))

            ),
            join = arrayListOf(
                    Join("join", "personAddress", "", "x1 ", arrayListOf(
                            Condition("x1", "personAddress_uid", "person_id", "=", "number"))),
                    Join("join", "address", "", "x1  && x2 ", arrayListOf(
                            Condition("x1", "personAddress_aid", "address_id", "=", "number"),
                            Condition("x2", "address_id", "2", ">", "number")))),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}