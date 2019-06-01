query (declare, variable, query, type) ::=
<<
/*
 * Query will be declared by the statement below
 */
 <if (declare)>var<endif> <variable> = '<query> as <type>'
/*
 * Query is declared now
 */
>>