package com.heitor.pdfgenerator.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.context.Context;

import com.heitor.pdfgenerator.model.Estudante;
import com.heitor.pdfgenerator.service.EstudanteService;
import com.heitor.pdfgenerator.service.PdfService;
import com.lowagie.text.DocumentException;

@Controller
public class EstudanteController {

	private EstudanteService estudanteService;
    private PdfService pdfService;
    
    private Logger LOG = LoggerFactory.getLogger(EstudanteController.class);

   // @Autowired
    public EstudanteController(EstudanteService estudanteService, PdfService pdfService) {
        this.estudanteService = estudanteService;
        this.pdfService = pdfService;
    }
    
    @GetMapping("/estudante")
    public ModelAndView studentsView(ModelAndView modelAndView) {
    	List<Estudante> lista = estudanteService.getEstudantes();
    	Collections.sort(lista);
        modelAndView.addObject("estudante", lista);
        modelAndView.setViewName("estudante");
        return modelAndView;
    }
    
    
    @GetMapping("/download-pdf")
    public void downloadPDFResource(HttpServletResponse response) throws IOException, DocumentException{
    	    		
    		Context context = new Context();
    		List<Estudante> lista = estudanteService.getEstudantes();
    		Collections.sort(lista);
    		context.setVariable("estudantes", lista);
    		context.setVariable("quantidade", estudanteService.getEstudantes().size());
    		
            Path file = Paths.get(pdfService.geradorPdf("pdf_estudante", "Estudantes", context).getAbsolutePath());//pdf_estudante é um arquivo html que fica dentro da pasta resources, este arquivo que gera o conteudo do pdf
            String localArquivoTemporario = file.getParent() + "\\" +  file.getFileName();
            LOG.info("NOME ARQUIVO TEMPORARIO: " + localArquivoTemporario);
   
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "Content-Disposition: attachment; filename="+ localArquivoTemporario);
            Files.copy(file, response.getOutputStream());
            response.getOutputStream().flush();
    }
    
    @GetMapping("/download-pdf-manual")
    public void downloadPDFManaulResource(HttpServletResponse response) throws IOException, DocumentException{
    		
            Path file = Paths.get(pdfService.geradorPdf("pdf_manual", "Manual", new Context()).getAbsolutePath());//pdf_manual é um arquivo html que fica dentro da pasta resources, este arquivo que gera o conteudo do pdf
            String localArquivoTemporario = file.getParent() + "\\" +  file.getFileName();
            LOG.info("NOME ARQUIVO TEMPORARIO: " + localArquivoTemporario);
   
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "Content-Disposition: attachment; filename="+ localArquivoTemporario);
            Files.copy(file, response.getOutputStream());
            response.getOutputStream().flush();
    }
}
