package com.okayde.gof.builder.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void run() {
        ExportHeaderModel ehm = new ExportHeaderModel();
        Map<String, Collection<ExportDataModel>> edm = new HashMap<String, Collection<ExportDataModel>>();
        ExportFooterModel efm = new ExportFooterModel();

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm, edm, efm);
        txtBuilder.getResult();

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director directorXml = new Director(xmlBuilder);
        directorXml.construct(ehm, edm, efm);
        xmlBuilder.getResult();
    }
}
