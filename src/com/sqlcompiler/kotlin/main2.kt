import com.sqlcompiler.kotlin.Condition
import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Join

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(
                    DesiredColumn("c_id", "c", "", "", false, arrayListOf()),
                    DesiredColumn("c_name", "c", "", "", false, arrayListOf()),
                    DesiredColumn("c_salary", "c", "", "", false, arrayListOf()),
                    DesiredColumn("c_birth_year", "c", "", "", false, arrayListOf()),
                    DesiredColumn("users_id", "users", "", "", false, arrayListOf()),
                    DesiredColumn("users_name", "users", "", "", false, arrayListOf()),
                    DesiredColumn("users_age", "users", "", "", false, arrayListOf()),
                    DesiredColumn("users_gender", "users", "", "", false, arrayListOf())),
            where = Pair("x0", arrayListOf(Condition("x0", "c_id", "-1", ">", "number"))),
            join = arrayListOf(Join("join", "users", "", "x1",
                    arrayListOf(Condition("x1", "c_id", "users_id", "=", "number")))),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}