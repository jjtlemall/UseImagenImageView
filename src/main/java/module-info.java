module com.example.useimagenimageview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.useimagenimageview to javafx.fxml;
    exports com.example.useimagenimageview;
}