import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PracticeMap {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("Karan", "Walia");
        names.put("Christiano", "Ronaldo");
        names.put("Lionel", "Messi");
        names.put("Paul", "Pogba");
        names.put("Kylian", "Mbappe");

        if(names.containsKey("Karan")){
            System.out.println("Karan is in the list");

            Map<Integer, BigDecimal> transactions = new HashMap<>();


        }


        public static void withdrawMoney(Map<Integer, BigDecimal> bankDetais, double amount, int account){
            BigDecimal amount = BigDecimal.valueof(amount);
            if(bankDetais.containsKey(account)){
                Bigdecimal newBalance =  map.get(account).minus(amount);
                map.put(account,newBalance);
            }
        }



    }

}
