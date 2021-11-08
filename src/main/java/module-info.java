module com.example.patientmanagesystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.patientmanagesystem to javafx.fxml;
    exports com.example.patientmanagesystem;
}