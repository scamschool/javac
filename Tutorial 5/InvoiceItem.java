/**
 * The InvoiceItem class models an item of an invoice, with ID, description, quantity and unit price.
 */
public class InvoiceItem {  // Save as "InvoiceItem.java"
   // private instance variable, not accessible from outside this class
   private String id;
   private String desc;
   private int qty;
   private double unitPrice;
   
   // Constructors (overloaded)
   /** Constructs an Employee instance with the given ID, description, quantity and unit price */
   public InvoiceItem(String i, String d, int q, double uPrice) {  // 1st constructor
      id = i;
      desc = d;
      qty = q;
      unitPrice = uPrice;
   }
   
   /** Returns the ID */
   public String getID() {
     return id; 
   }

   /** Returns the description */
   public String getDesc() {
     return desc; 
   }

   /** Returns the quantity */
   public int getQty() {
     return qty; 
   }

   /** Sets the quantity to the given value */
   public void setQty(int qty) {
      this.qty = qty;   // "this.qty" refers to the instance variable
                        // "qty" refers to the method's argument
   }

   /** Returns the unit price */
   public double getUnitPrice() {
     return unitPrice; 
   }

   /** Sets the unit price to the given value */
   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;   // "unitPrice.qty" refers to the instance variable
                                    // "unitPrice" refers to the method's argument
   }

   /** Returns the total */
   public double getTotal() {
     return unitPrice*qty; 
   }

   /** Return a self-descriptive string of this instance in the form of InvoiceItem[id=?,desc=?,qty=?,unitPrice=?] */
   public String toString() {
      return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
   }
}