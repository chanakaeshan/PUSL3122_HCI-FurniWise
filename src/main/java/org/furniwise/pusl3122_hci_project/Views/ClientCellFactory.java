package org.furniwise.pusl3122_hci_project.Views;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import org.furniwise.pusl3122_hci_project.Controllers.Admin.ClientCellController;
import org.furniwise.pusl3122_hci_project.Models.Client;

public class ClientCellFactory extends ListCell<Client> {

    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);

        if(empty){
            setText(null);
            setGraphic(null);
        }else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/ClientCell.fxml"));
            ClientCellController controller = new ClientCellController(client);
            loader.setController(controller);
            setText(null);

            try{
                setGraphic(loader.load());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
