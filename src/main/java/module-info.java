module library.libraryshamrai {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens library.libraryshamrai to javafx.fxml;
    exports library.libraryshamrai;
}