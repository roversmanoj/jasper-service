package com.spgi.codeathon.jasper.service.impl;

import com.spgi.codeathon.jasper.utils.JasperReportExporter;
import com.spgi.codeathon.jasper.utils.JasperReportFiller;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
public class CoreJasperServiceImpl {

  private JasperReportFiller reportFiller;

  private JasperReportExporter reportExporter;

  @Autowired
  public CoreJasperServiceImpl(JasperReportFiller reportFiller,
      JasperReportExporter reportExporter) {
    this.reportFiller = reportFiller;
    this.reportExporter = reportExporter;
  }

}
