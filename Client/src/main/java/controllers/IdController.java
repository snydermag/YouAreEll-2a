package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import models.Id;
import views.IdTextView;
import youareell.Command;

public class IdController {
    private HashMap<String, Id> allIds;

    Id tmpId;
    
    private TransactionController tctrl;

    public IdController(TransactionController tt) {
        this.tctrl = tt;
    }
    public ArrayList<Id> getIds() {
        return null;
    }

    public Id postId(Id id) {
        // create json from id
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {
        return null;
    }

    public void doCommand(Command cmd) {
        if (cmd.getCmd() == Command.Verb.GETIDS) {
            List<Id> ids = tctrl.getIds();
            for (int i = 0; i < 10; i++) {
                System.out.println(new IdTextView(ids.get(i)).toString());
            }
        }
    }
}