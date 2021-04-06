package com.pk.test;

import java.util.Map;
import java.util.TreeMap;

public class Program2 {
    public static StringBuffer productValues (Inventory[] items) {
        Map<String, Integer>    invCountByCode = new TreeMap<String, Integer> ();
        StringBuffer   result = new StringBuffer ();
        
        for (Inventory item : items)
        {
            if (invCountByCode.containsKey(item.product))
            {
                invCountByCode.put(item.product, 0);
            }
            
            Integer prevLevel = invCountByCode.get(item.product);
            
            prevLevel = prevLevel - item.qty;
        }

        for (String prodId : invCountByCode.keySet ())
        {
            result.append (invCountByCode.get(prodId)).append (",").append(prodId);
        }
        
        return result;
    }
    
    
    public class Inventory {
        public String  product;
        public Integer  qty;

        public Inventory(String product, Integer qty) {
            this.product = product;
            this.qty = qty;
        }

        
        @Override
        public String toString() {
            return qty + " * " + product;
        }
    }
}