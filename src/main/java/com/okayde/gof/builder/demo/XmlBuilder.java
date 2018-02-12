package com.okayde.gof.builder.demo;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel ehm) {

    }

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {

    }

    public void buildFooter(ExportFooterModel efm) {

    }

    public StringBuffer getResult() {
        return buffer;
    }
}
