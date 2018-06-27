package com.unicenta.pos.api;

import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.sales.DataLogicReceipts;

public class BaseDSL extends DataLogicSystem {
    protected DataLogicReceipts receiptsLogic;
    protected Session s;

    public void setReceiptsLogic(DataLogicReceipts receiptsLogic) {
        this.receiptsLogic = receiptsLogic;
    }

    public void init(Session s) {
        this.s = s;
        super.init(s);

    }
}