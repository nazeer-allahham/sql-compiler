import com.sqlcompiler.kotlin.Condition
import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Where

fun main() {
    Handler.select(table = "person",
            columns = arrayListOf(DesiredColumn("person_first_name", "person", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Where(" x1  &&  x2  || ( x3 || x4 || x5 )", arrayListOf(
                            Condition("x1", "person_last_name", "", "=", "string")
                            , Condition("x2", "person_id", "100", "<", "number")
                            , Condition("x3", "person_id", "1", "=", "int")
                            , Condition("x4", "person_id", "2", "=", "int")
                            , Condition("x5", "person_id", "3", "=", "int")
                    ))

            ),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}