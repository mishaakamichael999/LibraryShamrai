module library.libraryshamrai {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires de.jensd.fx.glyphs.fontawesome;

    opens library.libraryshamrai to javafx.fxml;
    exports library.libraryshamrai;
}