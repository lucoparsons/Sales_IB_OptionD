public class main {
    public SalesPerson[] salesPeople = new SalesPerson[100];
    public static void main(String args[]) {

    }

    public String highest() {
        SalesPerson s = salesPeople[0];
        for (int i = 0; i < salesPeople.length; i++) {
            if (salesPeople[i+1].calcTotalSales() > s.calcTotalSales()) {
                s = salesPeople[i+1];
            }
        }
        return s.getId();
    }

    public void addSales(Sales s, String id) {
        for (int i = 0; i < salesPeople.length; i++) {
            SalesPerson sp = salesPeople[i];
            if (sp.getId() == id) {
                sp.setSalesHistory(s);
            }
        }
    }

}
