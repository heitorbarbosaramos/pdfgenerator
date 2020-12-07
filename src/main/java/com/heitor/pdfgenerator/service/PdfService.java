package com.heitor.pdfgenerator.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;

@Service
public class PdfService {

//	 	private static final String PDF_RESOURCES = "/pdf-resources/";
	    private SpringTemplateEngine templateEngine;

	    @Autowired
	    public PdfService(SpringTemplateEngine templateEngine) {
	        this.templateEngine = templateEngine;
	    }

	    public File geradorPdf(String paginaHtml, String nomeAruivo, Context context) throws IOException, DocumentException {
	    		        
	        String html = templateEngine.process(paginaHtml, context);
	        
	        File file = File.createTempFile(nomeAruivo, ".pdf");
	        OutputStream outputStream = new FileOutputStream(file);
	        ITextRenderer renderer = new ITextRenderer(20f * 4f / 3f, 20);
//	        renderer.setDocumentFromString(html, new ClassPathResource(PDF_RESOURCES).getURL().toExternalForm());
	        renderer.setDocumentFromString(html);
	        renderer.layout();
	        renderer.createPDF(outputStream);
	        outputStream.close();
	        file.deleteOnExit();
	       
	        return file;
	    }
}