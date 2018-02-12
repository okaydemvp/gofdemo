package com.okayde.gof.builder.demo;

import java.util.Collection;
import java.util.Map;

public interface Builder {
    void buildHeader(ExportHeaderModel ehm);

    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    void buildFooter(ExportFooterModel efm);
}
