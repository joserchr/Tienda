
package com.tienda.Controller;


import com.tienda.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reportes")
public class ReporteController {
    
    @Autowired
    private ReporteService reporteService;
    
    @GetMapping("/principal")
    public String listado(Model model) {
        return "/reportes/principal";
    }
    
   
    
    
}
