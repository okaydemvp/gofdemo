package com.okayde.gof.builder.demo;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
    }

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            buffer.append(tblName + "\n");
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }
        }
    }

    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
