select(tables,
       columns,
       where,
       conditions,
       groupBy,
       orderBy) ::=
<<
Handler.select(names = arrayListOf(<tables>),
               desiredColumns = arrayListOf(<columns : {column | DesiredColumn(<column>)}; separator=",">),
               conditions = <where> to arrayListOf(<conditions : {condition | <condition>}; separator=",">),
               groupBy = arrayListOf(<groupBy : {item | <item>}; separator=",">),
               orderBy = arrayListOf(<orderBy : {item | <item>}; separator=",">))
>>