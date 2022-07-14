module com.devpact.invoiceried {
    requires javafx.controls;
    requires javafx.fxml;

    requires static lombok;

    requires org.controlsfx.controls;

    opens com.devpact.invoiceried to javafx.fxml;
    exports com.devpact.invoiceried;
    exports com.devpact.invoiceried.infrastructure;
    opens com.devpact.invoiceried.infrastructure to javafx.fxml;
}