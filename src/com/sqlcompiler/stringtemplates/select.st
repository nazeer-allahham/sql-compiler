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
               columns = arrayListOf(<columns: {column | DesiredColumn("<column.columnName>" ,"<column.functionName>", "<column.nameAlias>",<column.distinct>)}; separator=",\n\t\t\t\t\t">),
               where = <where> to arrayListOf(<conditions: {condition | "<condition>"}; separator=",">),
               join = arrayListOf(<joins: {join | Join("<join.type>", "<join.tableName>", "<join.tableAlias>", "<join.condition>", arrayListOf(<join.conditionColumns: {column | "<column>" }; separator=",">))}; separator=",">),
               groupBy = arrayListOf(<groupBy: {item | "<item>"}; separator=",">),
               orderBy = arrayListOf(<orderBy: {item | "<item>"}; separator=",">),
               <if (combineSource)>combine = "<combineType>" to <combineSource> as ArrayList\<Row>,<endif>
               distinct = <distinct>,
               purpose = <purpose>)
>>