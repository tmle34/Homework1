package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<Employee> employeeListView;
    @FXML
    private TextField firstnameText;
    @FXML
    private TextField lastnameText;
    @FXML
    private CheckBox isActive;
    @FXML
    private Button ClearButton;
    @FXML
    private Button AddButton;
    @FXML
    private Button DeleteButton;
    private ObservableList<Employee> items;
    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        items = employeeListView.getItems();
        ClearButton.setOnAction(this::clearbut);
        AddButton.setOnAction(this::addbutt);
        DeleteButton.setOnAction(this::deletbutt);
    }
    public void clearbut(ActionEvent event){

        firstnameText.clear();
        lastnameText.clear();
        isActive.setSelected(false);
    }

    public void addbutt(ActionEvent event){
        items = employeeListView.getItems();
        Employee employee = new Employee();
        employee.firstName = firstnameText.getText();
        employee.lastName = lastnameText.getText();
        employee.isActive1 = isActive.isSelected();
        items.add(employee);
    }

    public void deletbutt(ActionEvent evente){
        ObservableList<Employee> employeeSelected, allEmployees;
        allEmployees = employeeListView.getItems();
        employeeSelected = employeeListView.getSelectionModel().getSelectedItems();
        employeeSelected.forEach(allEmployees::remove);
    }

}
