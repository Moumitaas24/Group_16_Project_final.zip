package MD_Saif_Ahmed_Shishir;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class YearBalanceSheet {
    private final StringProperty month;
    private final StringProperty employeeSalary;
    private final StringProperty electricityBill;
    private final StringProperty transportCost;

    public YearBalanceSheet(String month, String employeeSalary, String electricityBill, String transportCost) {
        this.month = new SimpleStringProperty(month);
        this.employeeSalary = new SimpleStringProperty(employeeSalary);
        this.electricityBill = new SimpleStringProperty(electricityBill);
        this.transportCost = new SimpleStringProperty(transportCost);
    }

    public StringProperty monthProperty() { return month; }
    public StringProperty employeeSalaryProperty() { return employeeSalary; }
    public StringProperty electricityBillProperty() { return electricityBill; }
    public StringProperty transportCostProperty() { return transportCost; }
}
