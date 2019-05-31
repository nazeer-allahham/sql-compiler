import com.sqlcompiler.kotlin.*
import com.sqlcompiler.kotlin.Utils.smartSplit

fun main() {
    Handler.select(table = "c",
            columns = arrayListOf(DesiredColumn("c_id", "c", "", "", false, arrayListOf()), DesiredColumn("c_name", "c", "", "", false, arrayListOf()), DesiredColumn("c_salary", "c", "", "", false, arrayListOf()), DesiredColumn("c_birth_year", "c", "", "", false, arrayListOf()), DesiredColumn("users_id", "users", "", "", false, arrayListOf()), DesiredColumn("users_name", "users", "", "", false, arrayListOf()), DesiredColumn("users_age", "users", "", "", false, arrayListOf()), DesiredColumn("users_gender", "users", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Where(" x0  &&  x1 ", arrayListOf(Condition("x1", "c_id", "2", ">", "number")
                            , Condition("x2", "users_id", "3", ">=", "number")
                    ))

            ),
            join = arrayListOf(Join("innerjoin", "users", "", " x1 ", arrayListOf(Condition(" x1", "c_id", "users_id", "=", "number")))),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
/*
 * This statement will execute the query which stored in variable <x>
 */
    Handler.select(table = "c",
            columns = arrayListOf(DesiredColumn("c_id", "c", "", "", false, arrayListOf()), DesiredColumn("c_name", "c", "", "", false, arrayListOf()), DesiredColumn("c_salary", "c", "", "", false, arrayListOf()), DesiredColumn("c_birth_year", "c", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Where("", arrayListOf())

                    , smartSplit("c_id", "int", Handler.select(table = "users",
                    columns = arrayListOf(DesiredColumn("users_id", "users", "", "", false, arrayListOf())),
                    wheres = arrayListOf(
                            Where("", arrayListOf())

                    ),
                    join = arrayListOf(),
                    groupBy = arrayListOf(),
                    orderBy = arrayListOf(),
                    distinct = false,
                    purpose = 4) as String)),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 32) as ArrayList<Row>

}