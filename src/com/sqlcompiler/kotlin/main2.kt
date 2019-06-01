import com.sqlcompiler.kotlin.*
import com.sqlcompiler.kotlin.Utils.smartSplit

fun main() {
    Handler.select(table = "person",
            columns = arrayListOf(DesiredColumn("person_first_name", "person", "", "", false, arrayListOf()), DesiredColumn("address_name", "address", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Where(" x1 ", arrayListOf(Condition("x1", "personAddress_uid", "100", "<", "number")
                    ))

            ),
            join = arrayListOf(Join("join", "personAddress", "", " x1  x2 ",
                    arrayListOf(Condition(" x1", "personAddress_uid", "person_id", "=", "number"),
                            Condition(" x2", "personAddress_aid", "address_id", "=", "number")))),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}