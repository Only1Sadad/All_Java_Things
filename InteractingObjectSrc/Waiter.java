public class Waiter {
    /**
     * Attributes
     * average_order (double that represents the average number of minutes a Waiter spends taking a table's orders)
     * tables covered (int that represents the number of tables the Waiter has to wait)
     * orders_until_break (int that represents how many tables the Waiter needs to take orders from before going on break)
     * break_length (int that represents the number of minutes the Waiter is on break)
     */
double average_order;
int tables_covered;
int orders_until_break;
int break_length;

    //Constructor for the Waiter class. Initializes a new Waiter with the given attributes.
    public Waiter(double average_order, int tables_covered, int orders_until_break, int break_length){
  this.average_order = average_order;
  this.tables_covered = tables_covered;
  this.orders_until_break = orders_until_break;
  this.break_length = break_length;
}
/**
 * take_order(table) which determines how long the Waiter spends taking the order at that table.
 * The Waiter takes (average_order) + (0.25 * tables_covered) minutes to take each orde.
 * If the "table" input variable is "Family" then the Waiter takes twice as long.
 * Every time the Water takes an order, their orders_until_break goes down by 1
 */
public double take_Order(String table){
    double timeItTakesForEachOrder= average_order + (0.25 * tables_covered);
    if(table.equalsIgnoreCase("Family")){
        timeItTakesForEachOrder *= 2;
    }
    orders_until_break--;
    return timeItTakesForEachOrder;
}
/**
 * take_break() checks whether orders_until_break is 0.
 * If it is then return true and take break (+break_length minutes).
 * If value > 0 then keep going. After taking a break, reset orders_until_break to 3
 */
public boolean take_break(){
if (orders_until_break == 0){
    orders_until_break= 3;
    return true;
}
    return false;
}
}
