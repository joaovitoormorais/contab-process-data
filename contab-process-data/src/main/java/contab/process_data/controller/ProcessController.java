package contab.process_data.controller;

import contab.process_data.service.IProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

    private final IProcessService processService; //É a declaração da variável

    public ProcessController(IProcessService processService) {
        this.processService = processService;
    }

    @GetMapping
    public String getProcess() {
        return "";
    }
}
