module com.mycompany.diemslot {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.diemslot to javafx.fxml;
    exports com.mycompany.diemslot;
}
