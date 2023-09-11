module com.example.javafxexec {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javafxexec to javafx.fxml;
    opens com.example.javafxexec.basico to javafx.fxml;
    exports com.example.javafxexec;
    exports com.example.javafxexec.basico;
}