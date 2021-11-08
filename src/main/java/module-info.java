module com.example.patientmanagementsystemversion02 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.patientmanagementsystemversion02 to javafx.fxml;
    exports com.example.patientmanagementsystemversion02;
}