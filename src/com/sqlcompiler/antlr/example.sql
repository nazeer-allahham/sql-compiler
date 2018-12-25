void x(){
  CREATE TABLE CUSTOMER(string name, string birthday, int salary, string GSM, bool is_vip);
  CREATE TABLE CALLS(string from_customer, string to_customer, string date_key, float duration, int cost);

  var calls_summary = SELECT COUNT(*) calls_count, SUM(cost) total_cost FROM CALLS;
  int calls_cnt = SELECT COUNT(*) FROM CALLS;
  var vip_count = SELECT cu.name,SUM(duration) duration
  FROM CUSTOMER cu
  INNER JOIN CALLS
  ON CUSTOMER.name = CALLS.from_customer
  WHERE cu.is_vip IS TRUE
  GROUP BY cu.name;

  for(int i=0;i<vip_count.count;i++){
    var vip = vip_count[i];
    Write("Customer " + vip.name + " Duration is" + vip.duration);
  }

}
