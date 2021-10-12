package com.spgi.codeathon.jasper.config;

import com.spgi.codeathon.jasper.utils.JasperReportExporter;
import com.spgi.codeathon.jasper.utils.JasperReportFiller;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasperReportsConfig {

  @Bean
  public JasperReportFiller reportFiller() {
    return new JasperReportFiller();
  }

  @Bean
  public JasperReportExporter reportExporter() {
    return new JasperReportExporter();
  }
}
