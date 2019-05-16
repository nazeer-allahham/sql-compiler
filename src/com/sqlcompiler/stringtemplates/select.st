select(table,
       columns,
       where,
       conditions,
       joins,
       groupBy,
       orderBy,
       combineType,
       combineSource,
       distinct,
       purpose) ::=
<<
Handler.select(name = "<table>",
               columns = arrayListOf(<columns: {column | DesiredColumn("<column.columnName>","<column.tableName>","<column.columnAlias>","<column.functionName>",<column.distinct>,arrayListOf(<column.transforms: {transform | Transform("<transform.name>", arrayListOf(<transform.params: {param | "<param>"}; separator=",">)) }; separator=",">))}; separator=",">),
               where = Pair(<where>, arrayListOf(<conditions: {condition |  Condition("<condition.variable>",
                                "<condition.left>",
                                "<condition.right>","<condition.operator>","<condition.type>")}; separator=",\n">)),
               join = arrayListOf(<joins: {join | Join("<join.type>", "<join.tableName>", "<join.tableAlias>", "<join.condition>", arrayListOf(<join.conditionColumns: {column | "<column>" }; separator=",">))}; separator=",">),
               groupBy = arrayListOf(<groupBy: {item | "<item>"}; separator=",">),
               orderBy = arrayListOf(<orderBy: {item | "<item>"}; separator=",">),
               <if (combineSource)>combine = "<combineType>" to <combineSource> as ArrayList\<Row>,<endif>
               distinct = <distinct>,
               purpose = <purpose>)
>>
