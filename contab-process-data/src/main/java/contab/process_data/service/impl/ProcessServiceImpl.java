package contab.process_data.service.impl;

import contab.process_data.service.IProcessService;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl implements IProcessService {
    @Override
    public String getProcess() {
        return "get process";
    }
}
